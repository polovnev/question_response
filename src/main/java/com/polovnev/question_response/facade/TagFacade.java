package com.polovnev.question_response.facade;

import com.polovnev.question_response.converter.TagConverter;
import com.polovnev.question_response.dto.TagDto;
import com.polovnev.question_response.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TagFacade {

    @Autowired
    private TagConverter tagConverter;

    @Autowired
    private TagService tagService;

    public void createTag(TagDto tag) {

    }

    public void deleteTag(Long tagId) {

    }

    public void updateTag(Long tagId, TagDto tagDto) {

    }

    public List<TagDto> getAllTags() {
        return tagService.getAllTags().stream().map(tagConverter::entityToDto).collect(Collectors.toList());
    }

    public void addTagsForQuestion(Long questionId, List<Long> tagIds) {

    }

    public void removeTagForQuestion(Long questionId, Long tagId) {

    }
}
