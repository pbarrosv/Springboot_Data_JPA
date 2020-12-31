package com.springboot.datajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.datajpa.model.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
