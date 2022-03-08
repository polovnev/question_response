package com.polovnev.question_response.service;

import com.polovnev.question_response.entity.Response;


import java.util.List;

public interface ResponseService {

    void createResponse(Response response);

    void deleteResponse(Long id);

    List<Response> findResponsesForQuestion(Long questionId);

    void setIsResponseTrue(Long responseId, Long questionId, Long authorId);


}
