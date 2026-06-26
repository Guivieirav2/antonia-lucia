package br.leg.antonia.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "emenda")
public class Emenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String municipio;
    private String orgao;

    @Column(length = 1000)
    private String objeto;

    private Double valor;

    private String status;
    private Integer ano;
    private String numeroProcesso;
}