package com.polovnev.question_response.dto;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class QuestionDto {

    private Long id;
    private Long ratePoints;
    private String text;
    private Long author;
    private Long location;
    private Boolean isResponded;
    private LocalDate createdDate;

}
