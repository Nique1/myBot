package com.example.myBot;

import com.example.myBot.entities.Answer;
import com.example.myBot.entities.Question;
import com.example.myBot.repositories.AnswerRepository;
import com.example.myBot.repositories.QuestionRepository;
import com.example.myBot.services.AnswerService;
import com.example.myBot.services.QuestionService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
@SpringBootTest
class MyBotApplicationTests {
	@Mock
	private QuestionRepository questionRepository;

	@InjectMocks
	private QuestionService questionService;


	@Test
	public void saveQuestionTest(){
		//given
		String question = "What is 2 + 2?";
		Question expectedQuestion = new Question();
		expectedQuestion.setQuestion(question);

		//when
		//then
		when(questionRepository.save(any(Question.class))).thenReturn(expectedQuestion);

		Question savedQuestion = new Question();
		savedQuestion.setQuestion(question);
		assertEquals(expectedQuestion, savedQuestion);


	}

	@Mock
	private AnswerRepository answerRepository;

	@InjectMocks
	private AnswerService answerService;

	@Test
	public void saveAnswerTest(){
		String answer = "2 + 2 = 4";
		Answer expectedAnswer = new Answer();
		expectedAnswer.setAnswer(answer);

		//when
		//then
		when(answerRepository.save(any(Answer.class))).thenReturn(expectedAnswer);

		Answer savedAnswer = new Answer();
		savedAnswer.setAnswer(answer);
		assertEquals(expectedAnswer,savedAnswer);
	}


}
