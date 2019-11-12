package br.com.crud.paulo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.crud.paulo.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
