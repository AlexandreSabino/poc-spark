package br.com.netshoes.spark.service;

import br.com.netshoes.spark.entity.Pedido;

public interface PedidoService {

	Pedido consultaPedido();
	
	Double versao();
}
