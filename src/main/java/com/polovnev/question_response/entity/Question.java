package com.polovnev.question_response.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "question")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "author")
    private Long author;

    @Column(name = "location")
    private Long location;

    @Column(name = "is_responded")
    private Boolean isResponded;
}
