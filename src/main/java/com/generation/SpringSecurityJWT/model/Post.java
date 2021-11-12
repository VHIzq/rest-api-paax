package com.generation.SpringSecurityJWT.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String titulo;

    @Column(nullable = false)
    private String fecha;

    @Column(nullable = false)
    private String tituloPista;

    @Column(nullable = false)
    private String tituloAlbum;

    @Column(nullable = false)
    private String urlImagenAlbum;

    @Column(columnDefinition = "text")
    private String contenido;

    @ManyToOne
    @JsonProperty(access = Access.WRITE_ONLY)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTituloPista() {
        return tituloPista;
    }

    public void setTituloPista(String tituloPista) {
        this.tituloPista = tituloPista;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public String getUrlImagenAlbum() {
        return urlImagenAlbum;
    }

    public void setUrlImagenAlbum(String urlImagenAlbum) {
        this.urlImagenAlbum = urlImagenAlbum;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

