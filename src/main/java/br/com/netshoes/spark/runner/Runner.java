package br.com.netshoes.spark.runner;

import static spark.Spark.after;
import static spark.Spark.exception;
import static spark.Spark.get;
import static spark.Spark.setPort;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import br.com.netshoes.spark.exception.RestfulException;
import br.com.netshoes.spark.service.PedidoService;
import br.com.netshoes.spark.utils.JsonUtils;

public class Runner {

	private static final String CONTENT_TYPE = "application/json";	

	@Inject
	private PedidoService pedidoService;

	public void outroNome(@Observes ContainerInitialized event) {
		
		setPort(9090);

		get("/teste", (req, res) -> "teste");
		get(":versao/consultaPedido", (req, res) -> JsonUtils.asJson(pedidoService.consultaPedido(), req.params("versao")));

		after((request, response) -> {
			response.type(CONTENT_TYPE);
		});

		// exception handling
		exception(RestfulException.class, (e, request, response) -> {
			RestfulException restfulException = (RestfulException) e;
			response.status(restfulException.getStatusCode());
			response.body(restfulException.getMessage());
		});
	}	
}
