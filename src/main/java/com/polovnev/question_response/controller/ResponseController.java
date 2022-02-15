package com.polovnev.question_response.controller;


import com.polovnev.question_response.facade.ResponseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question/{questionId}/response")
public class ResponseController {

    @Autowired
    private ResponseFacade responseFacade;

    @PostMapping
    public void addResponse(@PathVariable Long questionId) {

    }
}
