package com.tue.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {

private Medicamento medicamento;
	
	@BeforeEach
	void setUp() {
		medicamento = new Medicamento(1L, "Paracetamol", "Dor", "11/9");
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		medicamento.setId(2L);
		//Assert
		assertEquals(2L,medicamento.getId());
	}
	
	@Test
	@DisplayName("Testando getter e setter do campo nome")
	void testNome() {
		medicamento.setNome("Paracetamol");
		//Assert
		assertEquals("Paracetamol",medicamento.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void testBula() {
		medicamento.setBula("Dor");
		//Assert
		assertEquals("Dor", medicamento.getBula());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testDataValidade() {
		medicamento.setDataValidade("11/09");
		//Assert
		assertEquals("11/09", medicamento.getDataValidade());
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		Medicamento novoMedicamento = new Medicamento(3L, "Rivotril", "Sla oq faz", "23/10");
		assertAll("NovoMedicamento",
				()-> assertEquals(3L, novoMedicamento.getId()),
				()-> assertEquals("Rivotril", novoMedicamento.getNome()),
				()-> assertEquals("Sla oq faz", novoMedicamento.getBula()),
				()-> assertEquals("23/10", novoMedicamento.getDataValidade()));
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
