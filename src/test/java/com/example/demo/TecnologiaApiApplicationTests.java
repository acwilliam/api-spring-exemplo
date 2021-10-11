package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import com.tecnologia.api.controller.ClienteController;
import com.tecnologia.api.model.Cliente;
import com.tecnologia.api.repository.ClienteRepository;

import net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForGivenType;

@WebMvcTest
class TecnologiaApiApplicationTests {
	
	@Autowired
	private ClienteController clienteController;
	
	@MockBean
	private ClienteRepository clienteRepository;
	
	@BeforeEach
	public void setUp() {
		StandaloneMockMvcBuilder(this.clienteController);
	}
	
	private void StandaloneMockMvcBuilder(ClienteController clienteController2) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testeErro() {
		Cliente cliente = new Cliente();
		
		cliente.setNome("William");
		
	
		}
		
		
	}
	


