package com.polovnev.question_response.listener;

import com.polovnev.question_response.dto.ResponseDto;
import com.polovnev.question_response.facade.ResponseFacade;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class ResponseListener {

    @Autowired
    private ResponseFacade responseFacade;

    @RabbitListener(queues = "response create")
    public void createResponse(ResponseDto responseDto) {
        responseFacade.createResponse(responseDto);
    }
}
