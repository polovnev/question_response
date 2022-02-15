package com.polovnev.question_response.facade;

import com.polovnev.question_response.converter.ResponseConverter;
import com.polovnev.question_response.dto.ResponseDto;
import com.polovnev.question_response.entity.Response;
import com.polovnev.question_response.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResponseFacade {

    @Autowired
    private ResponseConverter responseConverter;

    @Autowired
    private ResponseService responseService;

    public void addResponse(Long questionId, ResponseDto responseDto) {
        Response response = responseConverter.dtoToEntity(responseDto);
        responseService.createResponse(response);
    }
}
