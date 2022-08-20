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
@Table(name = "pagamentos")
public class PagamentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numberLine;
    @Column(length = 50, nullable = false)
    private String status;
    @Column(length = 10, nullable = false)
    private BigDecimal valor;
    @Column(length = 10, nullable = false)
    private BigDecimal diferenca;
    @Column(length = 10, nullable = false)
    private BigDecimal valorFinal;

}