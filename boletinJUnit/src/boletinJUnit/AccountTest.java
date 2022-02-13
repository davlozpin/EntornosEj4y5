package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	Account a1 = new Account("Pepe", 121212, 1430.0f);
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

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
	void testDeposit() {
		assertTrue(a1.deposit(5f));
		assertFalse(a1.deposit(-5f));
	}

	@Test
	void testWithdraw() {
		assertTrue(a1.withdraw(5f, 4f));
		assertFalse(a1.withdraw(-5f, -4f));
	}

	@Test
	void testGetBalance() {
		assertEquals(1430.0f, a1.getBalance());
	}

	@Test
	void testGetAccountNumber() {
		assertEquals(121212, a1.getAccountNumber());
	}

	@Test
	void testToString() {
		assertEquals(121212 + "Pepe" + fmt.format(1430.0f), a1.toString());
	}

}