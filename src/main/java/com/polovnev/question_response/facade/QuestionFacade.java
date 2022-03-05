package com.polovnev.question_response.facade;

import com.polovnev.question_response.converter.QuestionConverter;
import com.polovnev.question_response.dto.QuestionDto;
import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.entity.Question;
import com.polovnev.question_response.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionFacade {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionConverter questionConverter;

    public QuestionDto getQuestion(Long id) {
        Question question = questionService.getQuestion(id);
        return questionConverter.entityToDto(question);
    }

    public List<QuestionDto> findQuestionByRequest(SearchRequest searchRequest) {
        return questionService.findQuestionsByRequest(searchRequest).stream()
                .map(questionConverter::entityToDto).collect(Collectors.toList());
    }

    public QuestionDto createQuestion(QuestionDto questionDto) {
        Question question = questionConverter.dtoToEntity(questionDto);
        question.setCreatedDate(LocalDate.now());
        question.setIsResponded(Boolean.FALSE);
        Question savedQuestion = questionService.createQuestion(question);
        return questionConverter.entityToDto(savedQuestion);
    }

    public void updateQuestion(Long id, QuestionDto questionDto) {
        questionDto.setId(id);
    }

    public void removeQuestion(Long id) {

    }
}
