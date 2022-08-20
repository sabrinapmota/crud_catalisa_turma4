package com.aula42.listaDeProdutos.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "recebimentos")

public class RecebimentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numberLine;
    @Column(length = 50, nullable = false)
    private String status;
    @Column(length = 10, nullable = false)
    private BigDecimal valorRecebido;
        @Column(length = 10, nullable = false)
    private BigDecimal valorFinalRecebido;

}
