package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Response;
import org.springframework.data.repository.CrudRepository;

public interface ResponseRepository extends CrudRepository<Response, Long> {
}
