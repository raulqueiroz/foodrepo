package com.algaworks.algafood.domain.infrastructure.repository.spec;

import java.math.BigDecimal;

import org.springframework.data.jpa.domain.Specification;

import com.algaworks.algafood.domain.model.Restaurante;

public class RestauranteSpecs {

	public static Specification<Restaurante> comFreteGrais() {

		return (root, query, builder) -> builder.equal(root.get("taxaFrete"), BigDecimal.ZERO);

	}

	public static Specification<Restaurante> comNomeSemelhante(String nome) {

		return (root, query, builder) -> builder.equal(root.get("nome"), "%" + nome + "%");
	}
}
