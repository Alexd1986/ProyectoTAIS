package IngenieriaSoftwareTopicosAvanzados.ProyectoTAIS;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	
	@Test
	public void sumaTest() {
		int resultado = Calculadora.suma(5, 8);
		int esperado = 13;
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void restaTest() {
		int resultado = Calculadora.resta(8, 8);
		int esperado = 0;
		assertEquals(esperado, resultado);
		
	}

}
