package com.polovnev.question_response.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class QuestionDto {

    private Long id;
    private Long ratePoints;
    private String text;
    private Long authorId;
    private Long location;
    private Boolean isResponded;
    private LocalDate createdDate;
    private Set<TagDto> tags;
    private Set<ResponseDto> responses;

}
