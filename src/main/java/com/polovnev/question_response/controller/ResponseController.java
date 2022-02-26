package com.polovnev.question_response.controller;


import com.polovnev.question_response.dto.ResponseDto;
import com.polovnev.question_response.facade.ResponseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question/{questionId}/response")
public class ResponseController {

    @Autowired
    private ResponseFacade responseFacade;

    @PostMapping
    public void addResponse(@PathVariable Long questionId, @RequestBody ResponseDto responseDto) {
        responseFacade.addResponse(questionId, responseDto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ResponseDto> findResponsesByQuestionId(@PathVariable(name = "questionId") Long questionId) {
        return responseFacade.findResponsesByQuestionId(questionId);
    }
}
