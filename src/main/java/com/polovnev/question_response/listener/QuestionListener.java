package com.polovnev.question_response.listener;

import com.polovnev.question_response.dto.QuestionDto;
import com.polovnev.question_response.facade.QuestionFacade;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class QuestionListener {

    @Autowired
    private QuestionFacade questionFacade;

    @RabbitListener(queues = "question create")
    public void receiveMessage(final QuestionDto questionDto) {
        questionFacade.createQuestion(questionDto);
    }
}
