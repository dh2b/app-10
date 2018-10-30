package br.com.tt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<Cliente>();

		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Pedro");

		clientes.add(cliente);
		clientes.add(new Cliente(2L, "Maria"));
		clientes.add(new Cliente(3L, "Ana"));
		
		Collections.sort(clientes);
		clientes.forEach(System.out::println);

	}
}
