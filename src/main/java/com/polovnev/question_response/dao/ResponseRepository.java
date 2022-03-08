package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Response;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResponseRepository extends CrudRepository<Response, Long> {

    List<Response> findByQuestion_Id(Long questionId);

    @Modifying
    @Query("UPDATE Response r SET r.isResponse = true WHERE r.id = :id")
    void setIsResponseTrue(@Param(value = "id") Long id);

}
