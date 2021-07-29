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

import armazempb.desafio.model.Cliente;
import armazempb.desafio.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired

	ClienteService clienteService;

	@GetMapping("/")
	private List<Cliente> getClientes() {
		return clienteService.getClientes();
	}

	@GetMapping("/{id}")
	private Cliente getCliente(@PathVariable("id") int idCliente) {
		return clienteService.getClienteById(idCliente);
	}

	@PostMapping("/")
	private Cliente saveCliente(@RequestBody Cliente cliente) {
		clienteService.saveOrUpdate(cliente);

		return cliente;
	}

	@PutMapping("/")
	private Cliente updateCliente(@RequestBody Cliente cliente) {
		clienteService.saveOrUpdate(cliente);

		return cliente;
	}

	@DeleteMapping("/{id}")
	private void deleteCliente(@PathVariable("id") int idCliente) {
		clienteService.delete(idCliente);
	}
}