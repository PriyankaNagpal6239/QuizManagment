package com.quiz.QuizService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class question {

	private int questionID;
	private String questionName;
	private int quizId;
}
