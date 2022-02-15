package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Long, Question> {
}
