package com.polovnev.question_response.service;

import com.polovnev.question_response.entity.Tag;

import java.util.List;

public interface TagService {

    void createTag(Tag tag);

    void deleteTag(Long tagId);

    void updateTag(Tag tag);

    List<Tag> getAllTags();

    void addTagsForQuestion(Long questionId, List<Long> tagIds);

    void removeTagForQuestion(Long questionId, Long tagId);

}
