package armazempb.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import armazempb.desafio.model.Pedido;
import armazempb.desafio.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	@Autowired

	PedidoService pedidoService;

	@GetMapping("/")
	private List<Pedido> getPedidos() {
		return pedidoService.getPedidos();
	}

	@GetMapping("/{id}")
	private Pedido getPedido(@PathVariable("id") int idPedido) {
		return pedidoService.getPedidoById(idPedido);
	}

	@PostMapping("/")
	private Pedido savePedido(@RequestBody Pedido pedido) {
		pedidoService.saveOrUpdate(pedido);

		return pedido;
	}

	@PutMapping("/")
	private Pedido updatePedido(@RequestBody Pedido pedido) {
		pedidoService.saveOrUpdate(pedido);

		return pedido;
	}

	@DeleteMapping("/{id}")
	private void deletePedido(@PathVariable("id") int idPedido) {
		pedidoService.delete(idPedido);
	}
}