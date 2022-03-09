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
    @Query("UPDATE Response r SET r.isResponse = :isResponse " +
            "WHERE r.id = :id AND r.question.id = :questionId")
    void setIsResponse(@Param(value = "id") Long id,
                       @Param(value = "questionId") Long questionId,
                       @Param(value = "isResponse") boolean isResponse);

}
