package com.polovnev.question_response.converter;

import com.polovnev.question_response.dto.ResponseDto;
import com.polovnev.question_response.entity.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResponseConverter {

    @Autowired
    private ModelMapper modelMapper;

    public ResponseDto entityToDto(Response response) {
        return modelMapper.map(response, ResponseDto.class);
    }

    public Response dtoToEntity(ResponseDto responseDto) {
        return modelMapper.map(responseDto, Response.class);
    }
}
