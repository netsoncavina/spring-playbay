package com.fatec.sig6.ports;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.sig6.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Optional<Produto> findById(String id);

	List<Produto> findAllByNomeIgnoreCaseContaining(String nome);

}
