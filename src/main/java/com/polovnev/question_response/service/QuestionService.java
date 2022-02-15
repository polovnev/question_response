package com.polovnev.question_response.service;

import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.entity.Question;

import java.util.List;

public interface QuestionService {

    void createQuestion(Question question);

    void updateQuestion(Question question);

    Question getQuestion(Long id);

    List<Question> findQuestionByRequest(SearchRequest searchRequest);

    void removeQuestion(Long id);
}
