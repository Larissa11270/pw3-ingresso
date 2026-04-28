package br.com.etechoracio.ingresso.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_FILME")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME")
    private Long Id;

    @Column(name="TX_NOME")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="TP_GENERO")
    private GeneroEnum genero;

}
