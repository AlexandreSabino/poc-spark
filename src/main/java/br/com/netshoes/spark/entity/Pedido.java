package br.com.netshoes.spark.entity;

import java.math.BigDecimal;
import java.util.Collection;

import com.google.gson.annotations.Since;

import lombok.Getter;
import lombok.Setter;

public class Pedido {

	@Getter
	@Setter
	private String nomeCliente;
	
	@Getter
	@Setter
	private String numeroPedido;
	
	@Getter
	@Setter
	@Since(1)
	private String versao1;
	
	@Getter
	@Setter
	@Since(2)
	private String versao2;
	
	@Getter
	@Setter
	@Since(3)
	private String versao3;
	
	@Getter
	@Setter
	private BigDecimal valorTotalPedido;
	
	@Getter
	@Setter
	private Collection<ItemPedido> itens;
	
	@Getter
	@Setter
	private Collection<Pagamento> pagamentos;
}
