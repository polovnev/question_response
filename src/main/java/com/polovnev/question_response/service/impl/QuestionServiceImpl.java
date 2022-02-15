package com.polovnev.question_response.service.impl;

import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.entity.Question;
import com.polovnev.question_response.service.QuestionService;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {

    @Override
    public Question getQuestion(Long id) {
        return null;
    }

    @Override
    public List<Question> findQuestionByRequest(SearchRequest searchRequest) {
        return null;
    }

    @Override
    public void createQuestion(Question question) {

    }

    @Override
    public void updateQuestion(Question question) {

    }

    @Override
    public void removeQuestion(Long id) {

    }
}
