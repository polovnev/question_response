package com.polovnev.question_response.service.impl;

import com.polovnev.question_response.dao.TagRepository;
import com.polovnev.question_response.entity.Tag;
import com.polovnev.question_response.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public void createTag(Tag tag) {

    }

    @Override
    public void deleteTag(Long tagId) {

    }

    @Override
    public void updateTag(Tag tag) {

    }

    @Override
    public List<Tag> getAllTags() {
        return null;
    }

    @Override
    public void addTagsForQuestion(Long questionId, List<Long> tagIds) {

    }

    @Override
    public void removeTagForQuestion(Long questionId, Long tagId) {

    }
}
