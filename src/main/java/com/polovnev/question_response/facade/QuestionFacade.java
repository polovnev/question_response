package com.polovnev.question_response.facade;

import com.polovnev.question_response.converter.QuestionConverter;
import com.polovnev.question_response.dto.QuestionDto;
import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionFacade {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionConverter questionConverter;

    public QuestionDto getQuestion(Long id) {
        return null;
    }

    public List<QuestionDto> findQuestionByRequest(SearchRequest searchRequest) {
        return questionService.findQuestionsByRequest(searchRequest).stream()
                .map(questionConverter::entityToDto).collect(Collectors.toList());
    }

    public void createQuestion(QuestionDto questionDto) {

    }

    public void updateQuestion(Long id, QuestionDto questionDto) {
        questionDto.setId(id);
    }

    public void removeQuestion(Long id) {

    }
}
