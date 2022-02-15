package com.polovnev.question_response.converter;

import com.polovnev.question_response.dto.QuestionDto;
import com.polovnev.question_response.entity.Question;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuestionConverter {

    @Autowired
    private ModelMapper modelMapper;

    public QuestionDto entityToDto(Question question) {
        return modelMapper.map(question, QuestionDto.class);
    }

    public Question dtoToEntity(QuestionDto questionDto) {
        return modelMapper.map(questionDto, Question.class);
    }
}
