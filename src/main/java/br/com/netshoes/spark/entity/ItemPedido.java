package br.com.netshoes.spark.entity;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class ItemPedido {

	@Getter
	@Setter
	private String sku;
	
	@Getter
	@Setter
	private BigDecimal valorItem; 
}
