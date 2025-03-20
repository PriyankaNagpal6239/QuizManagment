	package com.quiz.QuizService.entity;


import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="quizDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int quizId;
	private String quizType;
	transient private List<question> Questions;

}