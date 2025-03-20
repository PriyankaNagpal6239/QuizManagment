package com.questionService.questionService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questionService.questionService.entity.QuesEntity;


@Repository
public interface QuesRepo extends JpaRepository<QuesEntity, Integer> {

	List<QuesEntity> findByquizId(int quizId);
}
