package com.springboot.datajpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.datajpa.model.Cliente;

@Repository
public interface IClienteRepository extends PagingAndSortingRepository<Cliente, Long>{

}
