package com.example.aula2an;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

import androidx.room.Entity;

@Entity
public class Funcionario {

    @PrimaryKey
    private int re;
    private String nome;
    private Date dataAdmissao;
    private double salario;



}
