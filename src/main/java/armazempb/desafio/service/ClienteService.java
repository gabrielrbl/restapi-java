package armazempb.desafio.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import armazempb.desafio.model.Cliente;
import armazempb.desafio.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired

	ClienteRepository clienteRepository;

	public List<Cliente> getClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>();

		clienteRepository.findAll().forEach(c -> clientes.add(c));

		return clientes;
	}

	public Cliente getClienteById(int id) {
		return clienteRepository.findById(id).get();
	}

	public void saveOrUpdate(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public void delete(int id) {
		clienteRepository.deleteById(id);
	}

	public void update(Cliente cliente, int idCliente) {
		clienteRepository.save(cliente);
	}
}
