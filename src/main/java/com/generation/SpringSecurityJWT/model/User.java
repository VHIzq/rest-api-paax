package com.generation.SpringSecurityJWT.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id_usuarios;

    @Column(nullable = false, length = 50)
    private String nombres;

    @Column(nullable = false, length = 50)
    private String apellido_p;

    @Column(nullable = false, length = 50)
    private String apellido_m;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 50)
    private String contrasenia;

    @Column(nullable = false)
    private boolean edad_min;

    @Column(unique = true, nullable = false, length = 50)
    private  String nombre_usuario;

    @OneToMany(mappedBy = "id_usuarios")
    private List<Post> posts;


    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
