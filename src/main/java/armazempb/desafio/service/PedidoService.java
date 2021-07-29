package armazempb.desafio.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import armazempb.desafio.model.Pedido;
import armazempb.desafio.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired

	PedidoRepository pedidoRepository;

	public List<Pedido> getPedidos() {
		List<Pedido> pedidos = new ArrayList<Pedido>();

		pedidoRepository.findAll().forEach(c -> pedidos.add(c));

		return pedidos;
	}

	public Pedido getPedidoById(int id) {
		return pedidoRepository.findById(id).get();
	}

	public void saveOrUpdate(Pedido pedido) {
		pedidoRepository.save(pedido);
	}

	public void delete(int id) {
		pedidoRepository.deleteById(id);
	}

	public void update(Pedido pedido, int idPedido) {
		pedidoRepository.save(pedido);
	}
}
