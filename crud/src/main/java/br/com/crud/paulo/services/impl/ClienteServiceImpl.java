package br.com.crud.paulo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.paulo.documents.Cliente;
import br.com.crud.paulo.repositories.ClienteRepository;
import br.com.crud.paulo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listarTodos() {
		
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente listarPorId(String id) {
		
		Optional<Cliente> c = this.clienteRepository.findById(id);
		if (c.isPresent()) {
			return c.get();
		}
		throw new RuntimeException();
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRepository.deleteById(id);

	}

}
