package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Question;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends CrudRepository<Question, Long> {
    //TODO: implement search by location and tags
    List<Question> findByLocation(Long locationId);

    @EntityGraph(attributePaths = {"responses", "tags"})
    Optional<Question> findById(Long id);

    @Query("SELECT CASE WHEN q.authorId = :username THEN true ELSE false END FROM Question q WHERE q.id = :questionId")
    boolean isQuestionAssignedToUser(@Param(value = "questionId") Long questionId,
                                     @Param(value = "username") String username);
}
