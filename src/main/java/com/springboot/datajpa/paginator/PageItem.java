package com.springboot.datajpa.paginator;

public class PageItem {
	private int numero;
	private boolean actual;
	
	public PageItem(int numero, boolean actual) {
		this.numero = numero;
		this.actual = actual;
	}
	
}