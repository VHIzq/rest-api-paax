package com.generation.SpringSecurityJWT.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String tituo_pista;

    @Column(nullable = false, length = 255)
    private String titulo_album;

    @Column(columnDefinition = "text")
    private String img_album;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    public void setUser(User usuario) {
        this.usuario = usuario;
    }
}
