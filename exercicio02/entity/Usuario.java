package com.example.exercicio02.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Usuario {
    private long id;
    private String nome;
    private String email;
    private String senha;


}
