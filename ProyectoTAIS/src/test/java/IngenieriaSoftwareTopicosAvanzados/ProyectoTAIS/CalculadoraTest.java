package IngenieriaSoftwareTopicosAvanzados.ProyectoTAIS;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	
	Calculadora calculadora = new Calculadora();
	
	/**
	 * Verifica el escenario simple del metodo sumar
	 * 
	 * @author Alexandre Downar
	 */
	@Test
	public void sumaTest() {
		int a = 2;
		int b = 5;
		int c = 5;
		int resultado = 12;
		int obtenido = calculadora.sumar(a, b, c);
		assertEquals(resultado, obtenido);
	}

	/**
	 * Verifica el escenario simple del metodo restar
	 * 
	 * @author Alexandre Downar
	 */
	@Test
	public void restaTest() {
		int a = 6;
		int b = 2;
		int resultado = 4;
		int obtenido = calculadora.restar(a, b);
		assertEquals(resultado, obtenido);
	}

	/**
	 * Verifica el escenario simple del metodo multiplicar
	 * 
	 * @author Alexandre Downar
	 */
	@Test
	public void multiplicacionTest() {
		int a = 3;
		int b = 3;
		int resultado = 9;
		int obtenido = calculadora.multiplicar(a, b);
		assertEquals(resultado, obtenido);
	}

}
