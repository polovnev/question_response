package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Response;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ResponseRepository extends CrudRepository<Response, Long> {

    List<Response> findByQuestion_Id(Long questionId);


}
