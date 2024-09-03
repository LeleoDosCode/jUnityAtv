package com.tue.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {
	
	private Hospede hospede;
	
	@BeforeEach
	void setUp() {
		hospede = new Hospede(1L, "Leonardo", "leonardo.sigolo@gmail.com", "(15) 99610-0550");
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		hospede.setId(2L);
		//Assert
		assertEquals(2L,hospede.getId());
	}
	
	@Test
	@DisplayName("Testando getter e setter do campo nome")
	void testNome() {
		hospede.setNome("Leonardo");
		//Assert
		assertEquals("Leonardo",hospede.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void testEmail() {
		hospede.setEmail("leonardo.sigolo@gmail.com");
		//Assert
		assertEquals("leonardo.sigolo@gmail.com", hospede.getEmail());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		hospede.setTelefone("(15) 99610-0550");
		//Assert
		assertEquals("(15) 99610-0550", hospede.getTelefone());
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		Hospede novoHospede = new Hospede(3L, "Theuzo", "MaisRapidoQueOBolt@gmail.com", "(15) 99154-1490");
		assertAll("NovoHospede",
				()-> assertEquals(3L, novoHospede.getId()),
				()-> assertEquals("Theuzo", novoHospede.getNome()),
				()-> assertEquals("MaisRapidoQueOBolt@gmail.com", novoHospede.getEmail()),
				()-> assertEquals("(15) 99154-1490", novoHospede.getTelefone()));
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
