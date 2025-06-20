package com.myblog7.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="posts",  uniqueConstraints = {@UniqueConstraint(columnNames={"title"})})
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="content" ,nullable= false)
    private String content;

    @OneToMany(mappedBy="post", cascade= CascadeType.ALL)
    private List<Comment> comments;

}
