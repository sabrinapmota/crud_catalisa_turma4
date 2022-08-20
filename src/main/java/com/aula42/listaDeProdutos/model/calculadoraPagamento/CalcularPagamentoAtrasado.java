package com.aula42.listaDeProdutos.model.calculadoraPagamento;

import com.aula42.listaDeProdutos.model.PagamentosModel;

import java.math.BigDecimal;

public class CalcularPagamentoAtrasado implements CalcularValorPago {
    @Override
    public BigDecimal calcular (PagamentosModel pagamentosModel) {
        return pagamentosModel.getValor().add(pagamentosModel.getDiferenca());
    }
}
