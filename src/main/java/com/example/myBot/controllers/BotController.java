package com.example.myBot.controllers;

import com.example.myBot.dto.BotRequest;
import com.example.myBot.dto.BotResponse;
import com.example.myBot.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/bot")
public class BotController {

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

@GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam("prompt") String prompt) {
        BotRequest botRequest = new BotRequest(model, prompt);
        BotResponse botResponse = restTemplate.postForObject(url, botRequest, BotResponse.class);

        if(botResponse != null && botResponse.getChoices() != null && !botResponse.getChoices().isEmpty()){
            Message message = botResponse.getChoices().get(0).getMessage();

            if(message != null){
                return ResponseEntity.ok(message.getContent());
            }
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid response from the OpenAI API");
    }

}
