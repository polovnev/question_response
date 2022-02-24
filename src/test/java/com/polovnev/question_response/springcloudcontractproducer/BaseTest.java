package com.polovnev.question_response.springcloudcontractproducer;


import com.polovnev.question_response.controller.QuestionController;
import com.polovnev.question_response.dao.QuestionRepository;
import com.polovnev.question_response.entity.Question;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public abstract class BaseTest {

    @Autowired
    private QuestionController questionController;

    @MockBean
    private QuestionRepository questionRepository;

    @BeforeEach
    public void setup() {
        setupDbInteraction();
        StandaloneMockMvcBuilder standaloneMockMvcBuilder
                = MockMvcBuilders.standaloneSetup(questionController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }

    private void setupDbInteraction() {
        Question questionOne = Question.builder().id(1L).text("First question?")
                .author(1L).location(1L).isResponded(true).createdDate(LocalDate.MIN).build();
        Question questionTwo = Question.builder().id(2L).text("Second question?")
                .author(1L).location(1L).isResponded(false).createdDate(LocalDate.MIN).build();
        List<Question> questions = Arrays.asList(questionOne, questionTwo);
        Mockito.when(questionRepository.findByLocation(1L)).thenReturn(questions);
        Mockito.when(questionRepository.findById(1L)).thenReturn(Optional.of(questionOne));
    }
}
