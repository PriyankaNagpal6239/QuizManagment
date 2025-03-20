package com.questionService.questionService.entity;
import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="questionDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuesEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="quesID")
	private int questionID;
	private String questionName;
	private int quizId;
	
	   public String getQuestionName() {
	        return questionName;
	    }
}
