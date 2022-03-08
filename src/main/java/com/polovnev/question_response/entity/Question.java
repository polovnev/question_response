package com.polovnev.question_response.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "question")
@NamedEntityGraph(name = "question_with_tags_and_responses",
        attributeNodes = {@NamedAttributeNode("tags"), @NamedAttributeNode("responses")})
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "author")
    private Long authorId;

    @Column(name = "location")
    private Long location;

    @Column(name = "is_responded")
    private Boolean isResponded;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @OneToMany(mappedBy="question")
    private List<Response> responses;

    @JoinTable(
            name = "question_tag",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    @ManyToMany
    private Set<Tag> tags;
}
