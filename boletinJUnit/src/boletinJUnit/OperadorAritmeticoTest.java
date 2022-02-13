package boletinJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {

	OperadorAritmetico oa = new OperadorAritmetico();

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
	void testSuma() {
		assertEquals(10, oa.suma(3, 7));
		assertEquals(-4, oa.suma(-6, 2));
		assertEquals(-71, oa.suma(-50, -21));
		assertEquals(7, oa.suma(0, 7));
	}

	@Test
	void testDivision() {
		try {
			assertEquals(3, oa.division(6, 2));
		} catch (Exception e) {
			fail("El metodo nunca tiene que lanzar una exepción");
		}

		try {
			assertEquals(0, oa.division(6, 0));
			fail("El metodo debería lanzar una exepción");
		} catch (Exception e) {

			assertEquals(e.getMessage(), null);

		}

	}

}
