package com.aula42.listaDeProdutos.model.calculadoraPagamento;

import com.aula42.listaDeProdutos.model.PagamentosModel;

import java.math.BigDecimal;

public interface CalcularValorPago {

    BigDecimal calcular(PagamentosModel pagamentosModel);

}
