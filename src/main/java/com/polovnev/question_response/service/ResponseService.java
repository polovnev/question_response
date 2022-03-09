package com.polovnev.question_response.service;

import com.polovnev.question_response.entity.Response;


import java.util.List;

public interface ResponseService {

    void createResponse(Response response);

    void deleteResponse(Long id);

    List<Response> findResponsesForQuestion(Long questionId);

    void setIsResponse(Long responseId, Long questionId, boolean isResponse);


}
