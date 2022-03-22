package com.polovnev.question_response.service.impl;

import com.polovnev.question_response.dao.ResponseRepository;
import com.polovnev.question_response.entity.Response;
import com.polovnev.question_response.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResponseServiceImpl implements ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    @Override
    public void createResponse(Response response) {
        responseRepository.save(response);
    }

    @Override
    public void deleteResponse(Long id) {

    }

    @Override
    public List<Response> findResponsesForQuestion(Long questionId) {
        return responseRepository.findByQuestion_Id(questionId).stream()
                .map(this::setQuestionInResponseToNull).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public void setIsResponse(Long responseId, Long questionId, boolean isResponse) {
        responseRepository.setIsResponse(responseId, questionId, isResponse);
    }

    private Response setQuestionInResponseToNull(Response response) {
        response.setQuestion(null);
        return response;
    }
}
