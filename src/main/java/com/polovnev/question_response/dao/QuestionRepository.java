package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Question;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends CrudRepository<Question, Long> {
    //TODO: implement search by location and tags
    List<Question> findByLocation(Long locationId);

    @EntityGraph(value = "question_with_tags_and_responses")
    Optional<Question> findById(Long id);
}
