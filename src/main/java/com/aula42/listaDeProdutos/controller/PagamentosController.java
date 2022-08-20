package com.aula42.listaDeProdutos.controller;

import com.aula42.listaDeProdutos.model.PagamentosModel;

import com.aula42.listaDeProdutos.service.PagamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentosController {

    @Autowired
    private PagamentosService pagamentosService;

    @GetMapping(path = "/pagamentos")
    public List<PagamentosModel> buscarTodosPagamentos(){
        return pagamentosService.buscarPagamentos();
    }


    @GetMapping(path = "/pagamentos/{codigo}")
    public Optional<PagamentosModel> buscarPorId(@PathVariable Long codigo) {
        return pagamentosService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamentos")

    public PagamentosModel cadastrarPagamento(@RequestBody PagamentosModel pagamentosModel) {
        return pagamentosService.cadastrar(pagamentosModel);
    }

    @PutMapping(path = "/pagamentos/{codigo}")
    public PagamentosModel alterarProdutos(@RequestBody PagamentosModel pagamentosModel) {
        return pagamentosService.alterar(pagamentosModel);
    }

    @DeleteMapping(path = "/pagamentos/{codigo}")
    public void deletarPagamentos(@PathVariable Long codigo) {
        pagamentosService.deletar(codigo);
    }
}
