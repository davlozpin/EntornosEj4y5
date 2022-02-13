package es.sotero.endew.dawa.Ejercicio5JUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	Cuenta c = new Cuenta("10", "Pepe");
	Movimiento m = new Movimiento();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		m = null;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresarDouble() {
		try {
			c.ingresar(100.0);
		} catch (Exception e) {
			fail("Fallo, No se ha podido ingresar el dinero");
		}
		assertEquals(100.0, c.getSaldo());

	}

	@Test
	void testRetirarDouble() {
		try {
			c.ingresar(100.0);
			c.retirar(50.0);
		} catch (Exception e) {
			fail("Fallo, No se ha podido retirar el dinero");
		}
		assertEquals(50.0, c.getSaldo());
	}

	@Test
	void testIngresarStringDouble() {
		try {
			c.ingresar("Para la comida", 20.0);
		} catch (Exception e) {
			fail("Fallo, No se ha podido ingresar el texto ni el dinero");
		}
		assertEquals(20.0, c.getSaldo());
	}

	@Test
	void testRetirarStringDouble() {
		try {
			c.ingresar("Para la comida", 20.0);
			c.retirar("Para la comida", 20.0);
		} catch (Exception e) {
			fail("Fallo, No se ha podido retirar el texto ni el dinero");
		}
		assertEquals(0, c.getSaldo());
	}

}