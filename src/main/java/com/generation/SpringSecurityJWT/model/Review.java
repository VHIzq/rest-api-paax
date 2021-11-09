package com.generation.SpringSecurityJWT.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "resenia")

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_resenia;

    @Column(nullable = false,  length = 100)
    private  String titulo_resenia;


}





}
