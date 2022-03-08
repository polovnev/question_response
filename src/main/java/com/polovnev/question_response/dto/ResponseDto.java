package com.polovnev.question_response.dto;

import lombok.Data;

@Data
public class ResponseDto {

    private Long id;
    private String text;
    private String authorId;
    private Boolean isResponse;
    private QuestionDto question;
}
