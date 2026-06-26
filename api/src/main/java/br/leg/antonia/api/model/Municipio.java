package br.leg.antonia.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "municipio")

public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String regiao;
    private Integer votos;
    private Double idh;
    private Integer pib;
    private Integer populacao;
    private Integer upas;
    private Integer eleitores;

}
