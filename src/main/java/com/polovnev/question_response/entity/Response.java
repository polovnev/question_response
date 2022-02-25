package com.polovnev.question_response.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "response")
@Data
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "author")
    private Long author;

    @Column(name = "is_response")
    private Boolean isResponse;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
