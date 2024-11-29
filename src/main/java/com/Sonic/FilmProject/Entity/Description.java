package com.Sonic.FilmProject.Entity;

import jakarta.persistence.*;

@Entity
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String slug;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;
}
