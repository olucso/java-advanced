package com.lucas.entity;

import javax.persistence.*;

@Entity
@Table(name="TDS_TB_CLIENTE")
//name: nome igual ao generador, sequenceName: nome no Banco, allicationSize: incremento
@SequenceGenerator(name="cliente", sequenceName = "SQ_TDS_TB_CLIENTE", allocationSize = 1)
public class Cliente {

    @Id
    @Column(name="id_cliente")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")

    @Column(name="nm_cliente", nullable = false, length = 100)
    private String nome;
}
