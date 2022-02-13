package es.sotero.endew.dawa.Ejercicio5JUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	Movimiento m = new Movimiento();

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
	}

	@Test
	void testGetImporte() {
		try {
			m.setImporte(10.0);
			assertEquals(10.0, m.getImporte());
		} catch (Exception e) {
			fail("Fallo");
		}
	}

	@Test
	void testGetConcepto() {
		try {
			m.setConcepto("Comida");
			assertEquals("Comida", m.getConcepto());
		} catch (Exception e) {
			fail("Fallo");
		}
	}

	@Test
	void testSetConcepto() {
		try {
			m.setConcepto("Comida");
			assertEquals("Comida", m.getConcepto());
		} catch (Exception e) {
			fail("Fallo");
		}
	}

	@Test
	void testGetFecha() {
		try {
			m.setFecha(new Date(13 / 02 / 2021));
			assertEquals(13 / 02 / 2021, m.getFecha());
		} catch (Exception e) {
			fail("Fallo");
		}
	}

	@Test
	void testSetFecha() {
		try {
			m.setFecha(new Date(13 / 02 / 2021));
			assertEquals(13 / 02 / 2021, m.getFecha());
		} catch (Exception e) {
			fail("Fallo");
		}
	}

	@Test
	void testSetImporte() {
		try {
			m.setImporte(10.0);
			assertEquals(10.0, m.getImporte());
		} catch (Exception e) {
			fail("Fallo");
		}
	}

}