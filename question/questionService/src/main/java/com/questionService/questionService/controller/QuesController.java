package com.questionService.questionService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.questionService.questionService.entity.QuesEntity;
import com.questionService.questionService.repo.QuesRepo;


@RestController
@RequestMapping("/Question")
public class QuesController {

	@Autowired
	public QuesRepo quesRepo;
	
	@PostMapping("/")
	public QuesEntity addRecord(@RequestBody QuesEntity quizE) {
	System.out.println(quizE.toString());
	return this.quesRepo.save(quizE);
	}

	@PutMapping("/ut")
	public QuesEntity updateRecord(@RequestBody QuesEntity quizE) {
		return this.quesRepo.save(quizE);
	}

	@DeleteMapping("/de")
	public String deleteRecord(@PathVariable("id") int id) {
		this.quesRepo.deleteById(id);
		return "Record Deleted";
	}

	@GetMapping("/et")
	public List<QuesEntity> getData() {
		return this.quesRepo.findAll();
	}

	@GetMapping("/id")
	public Optional<QuesEntity> getRecord(@PathVariable("id") int id) {
		return this.quesRepo.findById(id);
	}
	
	 @GetMapping("/QuesID/{quizId}")
    public List<String> getQuestionNamesOfQuiz(@PathVariable("quizId") int quizId) {
        // Fetch all questions for the given quizId
        List<QuesEntity> questions = quesRepo.findByquizId(quizId);
        
        // Extract and return only the questionName from the list of QuesEntity
        return questions.stream()
                        .map(QuesEntity::getQuestionName)  // Extract the questionName
                        .collect(Collectors.toList());     // Collect them into a List<String>
    }
}
