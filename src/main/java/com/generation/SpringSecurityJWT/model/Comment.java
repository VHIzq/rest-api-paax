package com.generation.SpringSecurityJWT.model;

import javax.persistence.*;

@Entity
@Table(name = "comentarios")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_comentario;

    @Column(nullable = false,length = 255)
    private String comentario;

}
