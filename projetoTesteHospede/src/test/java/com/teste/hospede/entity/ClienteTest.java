package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClienteTest {
	private Cliente cliente;

	@BeforeEach
	void setUp(){
		//Arrange
		cliente = new Cliente(null, "Savinho", "(15)998445-6030", "123.983.484-89", "54.089.644-44" );
	}
	

	@Test
	@DisplayName("Testando o getter e setter do campo Id")
	void testId() {
		//Act
		cliente.setId(null);
		//Assert
		assertEquals(null, cliente.getId());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		cliente.setNome("Savinho");
		//Assert
		assertEquals("Savinho", cliente.getNome());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		//Act
		cliente.setTelefone("(15)998445-6030");
		//Assert
		assertEquals("(15)998445-6030", cliente.getTelefone());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo cpf")
	void testCpf() {
		//Act
		cliente.setCpf("145.695.243-78");
		//Assert
		assertEquals("145.695.243-78", cliente.getCpf());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo rg")
	void testRg() {
		//Act
		cliente.setRg("52.244.242-76");
		//Assert
		assertEquals("52.244.242-76", cliente.getRg());
	}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		//Act
		Cliente novoCliente = new Cliente(null, "Drogba", "(16)99627-4829", "145.695.243-78", "52.244.242-76");
		//Assertion
		assertAll("novoCliente",
				()-> assertEquals(null,novoCliente.getId()),
				()-> assertEquals("Drogba", novoCliente.getNome()),
				()-> assertEquals("(16)99627-4829",novoCliente.getTelefone()),
				()-> assertEquals("145.695.243-78", novoCliente.getCpf()),
				()-> assertEquals("52.244.242-76", novoCliente.getRg()));
	}

}
