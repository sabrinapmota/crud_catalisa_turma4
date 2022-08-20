package com.aula42.listaDeProdutos.model.calculadoraPagamento;

import org.springframework.stereotype.Component;

@Component
public class FactoryValoraPagar {
    public CalcularValorPago calcularValorPago(String statusPagamento) {
        if (statusPagamento.equalsIgnoreCase("Pagamento atrasado")) {
            return new CalcularPagamentoAtrasado();
        } else if (statusPagamento.equalsIgnoreCase("Pagamento em dia")) {
            return new PagamentoEmDia();
        } else {
            return null;
        }

    }
            }
