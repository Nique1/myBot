package com.example.myBot.services;

import com.example.myBot.entities.Question;
import com.example.myBot.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void saveQuestion(String createdQuestion){

        Question question = new Question();
        question.setQuestion(createdQuestion);

        questionRepository.save(question);
    }
}
