package com.polovnev.question_response.converter;


import com.polovnev.question_response.dto.TagDto;
import com.polovnev.question_response.entity.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TagConverter {

    @Autowired
    private ModelMapper modelMapper;

    public TagDto entityToDto(Tag tag) {
        return modelMapper.map(tag, TagDto.class);
    }

    public Tag dtoToEntity(TagDto tagDto) {
        return modelMapper.map(tagDto, Tag.class);
    }
}
