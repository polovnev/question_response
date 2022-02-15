package com.polovnev.question_response.service;

import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.entity.Question;

import java.util.List;

public interface QuestionService {

    Question getQuestion(Long id);

    List<Question> findQuestionsByRequest(SearchRequest searchRequest);

    void createQuestion(Question question);

    void updateQuestion(Question question);

    void removeQuestion(Long id);
}
