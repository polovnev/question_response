package com.polovnev.question_response.controller;

import com.polovnev.question_response.dto.QuestionDto;
import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.facade.QuestionFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class QuestionController {

    @Autowired
    private QuestionFacade questionFacade;

    @GetMapping("/{id}")
    public QuestionDto getQuestion(@PathVariable Long id) {
        return questionFacade.getQuestion(id);
    }

    @GetMapping
    public List<QuestionDto> findQuestionByRequest(@RequestBody SearchRequest searchRequest) {
        return questionFacade.findQuestionByRequest(searchRequest);
    }

    @PostMapping
    public void createQuestion(@RequestBody QuestionDto questionDto) {
        questionFacade.createQuestion(questionDto);
    }

    @PutMapping("/{id}")
    public void updateQuestion(@PathVariable Long id, @RequestBody QuestionDto questionDto) {
        questionFacade.updateQuestion(id, questionDto);
    }

    @DeleteMapping("/{id}")
    public void removeQuestion(@PathVariable Long id) {
        questionFacade.removeQuestion(id);
    }
}
