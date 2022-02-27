package com.polovnev.question_response.springcloudcontractproducer;


import com.polovnev.question_response.config.DaoTestConfig;
import com.polovnev.question_response.controller.QuestionController;
import com.polovnev.question_response.controller.ResponseController;
import com.polovnev.question_response.controller.TagController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;


@Import(DaoTestConfig.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public abstract class BaseTest {

    @Autowired
    private QuestionController questionController;

    @Autowired
    private ResponseController responseController;

    @Autowired
    private TagController tagController;


    @BeforeEach
    public void setup() {
        StandaloneMockMvcBuilder standaloneMockMvcBuilder
                = MockMvcBuilders.standaloneSetup(questionController,
                responseController, tagController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }

}
