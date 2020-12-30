package com.springboot.datajpa.controller;


import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.datajpa.dao.IClienteDao;
import com.springboot.datajpa.model.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	private IClienteDao clienteDao;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listarClientes(Model model) {
		model.addAttribute("titulo","Listado de Clientes");
		model.addAttribute("clientes",clienteDao.findAllClie());
		return "listar";
	}
	
	@RequestMapping(value = "/form")
	public String crear(Map<String,Object> model) {
		Cliente clie = new Cliente();
		model.put("cliente",clie);
		model.put("titulo", "Formulario de Cliente");		
		return "form";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(@Valid Cliente cliente, BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo","Formulario de Cliente");
			return "form";
		}
		
		clienteDao.save(cliente);
		return "redirect:listar";
	}
	
	
}
