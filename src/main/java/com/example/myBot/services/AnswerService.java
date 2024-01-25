package com.example.myBot.services;


import com.example.myBot.entities.Answer;
import com.example.myBot.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public void saveAnswer(String createdAnswer) {

        Answer answer = new Answer();
        answer.setAnswer(createdAnswer);

        answerRepository.save(answer);
    }

}
