package com.polovnev.question_response.dao;

import com.polovnev.question_response.entity.Tag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TagRepository extends CrudRepository<Tag, Long> {

    List<Tag> findAll();
}
