package com.polovnev.question_response.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "question")
@Builder
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

    @Column(name = "created_date")
    private LocalDate createdDate;
}
