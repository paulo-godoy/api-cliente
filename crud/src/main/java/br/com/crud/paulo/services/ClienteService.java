package br.com.crud.paulo.services;

import java.util.List;

import br.com.crud.paulo.documents.Cliente;

public interface ClienteService {
	
	List<Cliente> listarTodos();
	
	Cliente listarPorId(String id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(String id);

}
