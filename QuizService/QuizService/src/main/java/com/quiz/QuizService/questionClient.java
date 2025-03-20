package com.quiz.QuizService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.QuizService.entity.question;

@FeignClient(url="QUESTIONSERVICE", value="Question-Cleint")
public interface questionClient {
	@GetMapping("Qestion/quiz/{quizID}")
List<question> getQuestionOfQuiz(@PathVariable("quizId") int quizId);
}
