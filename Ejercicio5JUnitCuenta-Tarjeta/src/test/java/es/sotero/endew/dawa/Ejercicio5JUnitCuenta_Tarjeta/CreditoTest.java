package es.sotero.endew.dawa.Ejercicio5JUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoTest {

	Credito c = new Credito("10", "Pepe", new Date(13 / 02 / 2021), 100.0);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c = null;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		try {
			c.ingresar(100.0);
			assertEquals(100.0, c.getSaldo());
		} catch (Exception e) {
			fail("Fallo, No se ha podido ingresar el dinero");
		}

	}

	@Test
	void testRetirar() {
		try {
			c.ingresar(100.0);
			c.retirar(50.0);
			assertEquals(50.0, c.getSaldo());
		} catch (Exception e) {
			fail("Fallo, No se ha podido retirar el dinero");
		}

	}

	@Test
	void testpagoEnEstablecimiento() {
		try {
			c.ingresar(20.0);
			c.pagoEnEstablecimiento("Pago", 10.0);
			assertEquals(10.0, c.getSaldo(), 0);
		} catch (Exception e) {
			fail("Fallo, No se ha podido pagar");
		}

	}

}