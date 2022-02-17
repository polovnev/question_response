package com.polovnev.question_response.dto;

import lombok.Data;

import java.util.List;

@Data
public class SearchRequest {

    private String text;
    private List<Long> tags;
    private Long locationId;
}
