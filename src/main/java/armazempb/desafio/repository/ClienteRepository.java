package armazempb.desafio.repository;

import org.springframework.data.repository.CrudRepository;

import armazempb.desafio.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}