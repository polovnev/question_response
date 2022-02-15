package com.polovnev.question_response.service.impl;

import com.polovnev.question_response.dao.QuestionRepository;
import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.entity.Question;
import com.polovnev.question_response.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question getQuestion(Long id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public List<Question> findQuestionsByRequest(SearchRequest searchRequest) {
        return null;
    }

    @Override
    public void createQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void updateQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void removeQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}
