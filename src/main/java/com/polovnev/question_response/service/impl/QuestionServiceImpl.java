package com.polovnev.question_response.service.impl;

import com.polovnev.question_response.dao.QuestionRepository;
import com.polovnev.question_response.dto.SearchRequest;
import com.polovnev.question_response.entity.Question;
import com.polovnev.question_response.entity.Response;
import com.polovnev.question_response.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question getQuestion(Long id) {
        Optional<Question> questionOptional = questionRepository.findById(id);
        Question question = questionOptional
                .orElseThrow(() -> new RuntimeException("Question is not present"));
        question.getResponses().forEach(this::setQuestionInResponseToNull);
        return question;
    }

    //TODO: implement search by location, tags and text
    @Override
    public List<Question> findQuestionsByRequest(SearchRequest searchRequest) {
        return questionRepository
                .findByLocation(searchRequest.getLocationId())
                .stream().map(this::setResponsesInQuestionToNull)
                .collect(Collectors.toList());
    }

    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public void updateQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void removeQuestion(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public boolean isQuestionAssignedToUser(Long questionId, String username) {
        return questionRepository.isQuestionAssignedToUser(questionId, username);
    }

    private Question setResponsesInQuestionToNull(Question question) {
        question.setResponses(null);
        return question;
    }

    private void setQuestionInResponseToNull(Response response) {
        response.setQuestion(null);
    }

}
