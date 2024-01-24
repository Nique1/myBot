package com.example.myBot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/bot")
public class BotController {

    @Value("{$openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String url;
    private RestTemplate restTemplate;



}
