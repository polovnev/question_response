package com.polovnev.question_response.config;

import com.polovnev.question_response.dao.QuestionRepository;
import com.polovnev.question_response.dao.ResponseRepository;
import com.polovnev.question_response.dao.TagRepository;
import com.polovnev.question_response.entity.Question;
import com.polovnev.question_response.entity.Response;
import com.polovnev.question_response.entity.Tag;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@TestConfiguration
public class DaoTestConfig {

    @Primary
    @Bean
    public QuestionRepository questionRepositoryMock() {
        QuestionRepository questionRepository = Mockito.mock(QuestionRepository.class);

        Question questionOne = Question.builder().id(1L).text("First question?")
                .authorId("1").location(1L).isResponded(true).createdDate(LocalDate.MIN).build();
        Question questionTwo = Question.builder().id(2L).text("Second question?")
                .authorId("1").location(1L).isResponded(false).createdDate(LocalDate.MIN).build();
        List<Question> questions = Arrays.asList(questionOne, questionTwo);

        Mockito.when(questionRepository.findByLocationAndTags(1L,null)).thenReturn(questions);
        Mockito.when(questionRepository.findById(1L)).thenReturn(Optional.of(questionOne));

        return questionRepository;
    }

    @Primary
    @Bean
    public ResponseRepository responseRepositoryMock() {
        ResponseRepository responseRepository = Mockito.mock(ResponseRepository.class);

        Response responseOne = Response.builder().id(1L).text("First response!")
                .authorId("1").isResponse(true).build();
        Response responseTwo = Response.builder().id(2L).text("Second response!")
                .authorId("1").isResponse(true).build();
        List<Response> responses = Arrays.asList(responseOne, responseTwo);

        Mockito.when(responseRepository.findByQuestion_Id(1L)).thenReturn(responses);

        return responseRepository;
    }


    @Primary
    @Bean
    public TagRepository tagRepositoryMock() {
        TagRepository tagRepository = Mockito.mock(TagRepository.class);

        Tag tagOne = Tag.builder().id(1L).text("Documents").color("#FFF8DC").build();
        Tag tagTwo = Tag.builder().id(2L).text("Food").color("#7FFF00").build();

        List<Tag> tags = Arrays.asList(tagOne, tagTwo);

        Mockito.when(tagRepository.findAll()).thenReturn(tags);

        return tagRepository;
    }
}
