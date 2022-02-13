package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
	Pila p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		p = new Pila();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPushAndisEmpty() {
		// Probamos nº mayor de 20, no inserta en pila
		p.push(33);
		assertEquals(true, p.isEmpty());
		// Probamos nº menor de 2, no inserta en pila
		p.push(1);
		assertEquals(true, p.isEmpty());
		// Caso entre 2 y 20, si entre en pila
		p.push(12);
		assertEquals(false, p.isEmpty());

	}

	@Test
	void testPop() {
		assertEquals(null, p.pop());
		p.push(10);
		p.push(15);
		assertEquals(15, p.pop());
		assertEquals(10, p.pop());
		assertEquals(null, p.pop());

	}

	@Test
	void testTop() {
		assertEquals(null, p.top());
		p.push(5);
		assertEquals(5, p.top());
		p.push(14);
		assertEquals(14, p.top());
		assertEquals(false, p.isEmpty());

	}

}
