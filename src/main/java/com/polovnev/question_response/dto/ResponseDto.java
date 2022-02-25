package com.polovnev.question_response.dto;

import lombok.Data;

@Data
public class ResponseDto {

    private Long responseId;
    private String text;
    private Long author;
    private Boolean isResponse;

}
