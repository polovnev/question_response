package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Long> {
    //TODO: implement search by location and tags
    List<Question> findByLocation(Long locationId);
}
