package armazempb.desafio.repository;

import org.springframework.data.repository.CrudRepository;

import armazempb.desafio.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
}