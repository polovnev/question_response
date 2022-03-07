package com.polovnev.question_response.facade;

import com.polovnev.question_response.converter.ResponseConverter;
import com.polovnev.question_response.dto.ResponseDto;
import com.polovnev.question_response.entity.Response;
import com.polovnev.question_response.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class ResponseFacade {

    @Autowired
    private ResponseConverter responseConverter;

    @Autowired
    private ResponseService responseService;

    public void createResponse(ResponseDto responseDto) {
        responseDto.setIsResponse(false);
        Response response = responseConverter.dtoToEntity(responseDto);
        responseService.createResponse(response);
    }

    public List<ResponseDto> findResponsesByQuestionId(Long questionId) {
        return responseService.findResponsesForQuestion(questionId)
                .stream().map(responseConverter::entityToDto).collect(toList());
    }
}
