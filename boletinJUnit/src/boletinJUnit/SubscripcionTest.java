package boletinJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {

	Subscripcion s1 = new Subscripcion(10, 0);
	Subscripcion s2 = new Subscripcion(0, 31);
	Subscripcion s3 = new Subscripcion(10, 3);
	Subscripcion s4 = new Subscripcion(4, 2);

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
	void testPrecioPorMes() {
		assertEquals(0.0, s1.precioPorMes(), 0.0001);
		assertEquals(0.0, s2.precioPorMes(), 0.0001);
		assertEquals(4.3333, s3.precioPorMes(), 0.0001); // 0.0001 Es el marger de error en la compración de los dos
															// decimales (es el punto para hacer la comparacion)
		assertEquals(2.0, s4.precioPorMes(), 0.0001);

	}

	@Test
	void testCancel() {
		// Ponemos el primero para ver que el periodo es positivo por lo que la
		// suscripción no está cancelada y en la segunda está cancelada
		assertEquals(4.3333, s3.precioPorMes(), 0.0001);
		s3.cancel();
		assertEquals(0.0, s3.precioPorMes(), 0.0001);

	}

}
