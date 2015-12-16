package br.com.netshoes.spark.entity;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Pagamento {

	@Getter
	@Setter
	private String nomePagamento;
	
	@Getter
	@Setter
	private BigDecimal valor;
}
