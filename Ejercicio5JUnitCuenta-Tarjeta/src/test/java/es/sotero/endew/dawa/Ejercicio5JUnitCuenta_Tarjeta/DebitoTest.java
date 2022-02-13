package es.sotero.endew.dawa.Ejercicio5JUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	Cuenta c = new Cuenta("10", "Pepe");
	Movimiento m = new Movimiento();
	Debito d = new Debito("10", "Pepe J", new Date(13 / 02 / 2021));

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		c = null;
		m = null;
		d = null;
	}

	@Test
	void testRetirar() {
		try {
			d.ingresar(100.0);
			d.retirar(100.0);
			assertEquals(0, d.getSaldo());
		} catch (Exception e) {
			fail("Fallo, No se ha podido retirar el dinero");
		}
	}

	@Test
	void testIngresar() {
		try {
			d.ingresar(100.0);

			assertEquals(100.0, d.getSaldo());
		} catch (Exception e) {
			fail("Fallo, No se ha podido ingresar el dinero");
		}
	}

	@Test
	void testPagoEnEstablecimiento() {
		try {
			d.ingresar(100.0);
			d.pagoEnEstablecimiento("Pag", 50.0);
			assertEquals(50.0, d.getSaldo());
		} catch (Exception e) {
			fail("Fallo, No se ha podido pagar");
		}
	}

	@Test
	void testGetSaldo() {
		try {
			d.ingresar(100.0);

			assertEquals(100.0, d.getSaldo());
		} catch (Exception e) {
			fail("Fallo, No se ha podido ingresar el dinero");
		}
	}

}