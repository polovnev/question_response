package com.polovnev.question_response.service.impl;

import com.polovnev.question_response.dao.ResponseRepository;
import com.polovnev.question_response.entity.Question;
import com.polovnev.question_response.entity.Response;
import com.polovnev.question_response.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return responseRepository.findByQuestion_Id(questionId);
    }
}
