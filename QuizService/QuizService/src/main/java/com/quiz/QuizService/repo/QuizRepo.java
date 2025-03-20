package com.quiz.QuizService.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.QuizService.entity.QuizEntity;

@Repository
public interface QuizRepo extends JpaRepository<QuizEntity, Integer> {

}
