package com.ptbdams.apicrud.repository;

import com.ptbdams.apicrud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
