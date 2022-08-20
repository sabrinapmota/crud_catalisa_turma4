package com.aula42.listaDeProdutos.service;

import com.aula42.listaDeProdutos.repository.RecebimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecebimentosService {
    @Autowired
    private RecebimentosRepository recebimentosRepository;
}
