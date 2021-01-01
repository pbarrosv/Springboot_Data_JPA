package com.springboot.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.datajpa.dao.IClienteDao;
import com.springboot.datajpa.model.Cliente;
import com.springboot.datajpa.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository clienterepo;
	
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findAllClie() {
		return (List<Cliente>)clienterepo.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienterepo.save(cliente);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(Long id) {		
		return clienterepo.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienterepo.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		return clienterepo.findAll(pageable);
	}

}
