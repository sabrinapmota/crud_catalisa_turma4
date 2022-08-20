package com.aula42.listaDeProdutos.service;

import com.aula42.listaDeProdutos.model.PagamentosModel;
import com.aula42.listaDeProdutos.model.calculadoraPagamento.CalcularValorPago;
import com.aula42.listaDeProdutos.model.calculadoraPagamento.FactoryValoraPagar;
import com.aula42.listaDeProdutos.repository.PagamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentosService {
    @Autowired
    private PagamentosRepository pagamentosRepository;
    @Autowired
    private FactoryValoraPagar factoryValoraPagar;

    public List<PagamentosModel> buscarPagamentos() {
        return pagamentosRepository.findAll();
    }

    public Optional<PagamentosModel> buscarPagamentosId(Long numberLine) {
        return pagamentosRepository.findById(numberLine);
    }

    public PagamentosModel cadastrarPagamentos(PagamentosModel pagamentosModel) {
        CalcularValorPago calcularValorPago = factoryValoraPagar.calcularValorPago(pagamentosModel.getStatus());
        pagamentosModel.setValor(calcularValorPago.calcular(pagamentosModel));
        return pagamentosRepository.save(pagamentosModel);
    }

    public PagamentosModel alterarPagamentos(PagamentosModel pagamentosModel) {
        CalcularValorPago calcularValorPago = factoryValoraPagar.calcularValorPago(pagamentosModel.getStatus());
        pagamentosModel.setValor(calcularValorPago.calcular(pagamentosModel));
        return pagamentosRepository.save(pagamentosModel);

    }

    public void deletarPagamento(Long numberLine) {
        pagamentosRepository.deleteById(numberLine);
    }
}