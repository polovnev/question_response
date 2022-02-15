package com.polovnev.question_response.controller;

import com.polovnev.question_response.dto.TagDto;
import com.polovnev.question_response.facade.TagFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagFacade tagFacade;

    @PostMapping
    public void createTag(@RequestBody TagDto tagDto) {
        tagFacade.createTag(tagDto);
    }

    @DeleteMapping("/{tagId}")
    public void deleteTag(@PathVariable Long tagId) {
        tagFacade.deleteTag(tagId);
    }

    @PutMapping("/{tagId}")
    public void updateTag(@PathVariable Long tagId, @RequestBody TagDto tagDto) {
        tagFacade.updateTag(tagId, tagDto);
    }

    @GetMapping
    public List<TagDto> getAllTags() {
        return null;
    }

    public void addTagsForQuestion(Long questionId, List<Long> tagIds) {

    }

    public void removeTagForQuestion(Long questionId, Long tagId) {

    }
}
