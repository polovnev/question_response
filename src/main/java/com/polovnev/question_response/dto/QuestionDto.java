package com.polovnev.question_response.dto;

import lombok.Data;

@Data
public class QuestionDto {

    private Long id;
    private Long ratePoints;
    private String text;
    private Long author;
    private Long location;
    private Boolean isResponded;

}
