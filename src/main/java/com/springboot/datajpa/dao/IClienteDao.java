package com.springboot.datajpa.dao;

import java.util.List;

import com.springboot.datajpa.model.Cliente;

public interface IClienteDao{
	
	public List<Cliente> findAllClie();
	public void save(Cliente cliente);
	public Cliente findOne(Long id);
	public void delete(Long id);
}
