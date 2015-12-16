package br.com.netshoes.spark.service;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.netshoes.spark.entity.ItemPedido;
import br.com.netshoes.spark.entity.Pagamento;
import br.com.netshoes.spark.entity.Pedido;

public class PedidoServiceImpl implements PedidoService {

	@Override
	public Double versao() {		
		return 2.0;
	}
	
	public Pedido consultaPedido() {
		
		Pedido pedido = new Pedido();
		pedido.setNomeCliente("BISCOITO");
		pedido.setNumeroPedido("123");		
		pedido.setValorTotalPedido(BigDecimal.valueOf(100.00));
		pedido.setVersao1("versao1");
		pedido.setVersao2("versao2");
		pedido.setVersao3("versao3");
		
		ItemPedido itemPedido = new ItemPedido();		
		itemPedido.setSku("123-5574-558-99");
		itemPedido.setValorItem(BigDecimal.valueOf(100.00));
		
		Pagamento pagamento = new Pagamento();
		pagamento.setNomePagamento("VISA");
		pagamento.setValor(BigDecimal.valueOf(100.00));		
		
		pedido.setItens(Arrays.asList(itemPedido));
		pedido.setPagamentos(Arrays.asList(pagamento));
		
		return pedido;
	}	
}
