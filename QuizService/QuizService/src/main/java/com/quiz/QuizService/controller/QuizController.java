package com.quiz.QuizService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.QuizService.entity.QuizEntity;
import com.quiz.QuizService.repo.QuizRepo;



@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	public QuizRepo quizrepo;

	@PostMapping("/post")
	public QuizEntity addRecord(@RequestBody QuizEntity quizE) {
	System.out.println(quizE.toString());
	return this.quizrepo.save(quizE);
	}

	@PutMapping("/put")
	public QuizEntity updateRecord(@RequestBody QuizEntity quizE) {
		return this.quizrepo.save(quizE);
	}

	@DeleteMapping("/delete")
	public String deleteRecord(@PathVariable("id") int id) {
		this.quizrepo.deleteById(id);
		return "Record Deleted";
	}

	@GetMapping("/get")
	public List<QuizEntity> getData() {
		return this.quizrepo.findAll();
	}

	@GetMapping("/getnyid")
	public Optional<QuizEntity> getRecord(@PathVariable("id") int id) {
		return this.quizrepo.findById(id);
	}
}


