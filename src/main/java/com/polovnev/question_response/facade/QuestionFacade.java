package com.polovnev.question_response.facade;

import com.polovnev.question_response.dto.QuestionDto;
import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionFacade {

    @Autowired
    private QuestionService questionService;

    public QuestionDto getQuestion(Long id) {
        return null;
    }

    public List<QuestionDto> findQuestionByRequest(SearchRequest searchRequest) {
        return null;
    }

    public void createQuestion(QuestionDto questionDto) {

    }

    public void updateQuestion(Long id, QuestionDto questionDto) {
        questionDto.setId(id);
    }

    public void removeQuestion(Long id) {

    }
}
