package br.com.juliano.api.repositorio;

import org.springframework.data.repository.CrudRepository;


import br.com.juliano.api.modelo.Cliente;


public interface Repositorio extends CrudRepository<Cliente,Long> {
    
}
