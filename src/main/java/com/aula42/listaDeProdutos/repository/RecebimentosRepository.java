package com.aula42.listaDeProdutos.repository;

import com.aula42.listaDeProdutos.model.RecebimentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentosRepository extends JpaRepository<RecebimentosModel, Long> {
}
