package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

class FridgeTest {

	Fridge f1 = new Fridge();

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

	@ParameterizedTest
	@MethodSource("Fridge")
	public static List<String[]> food() {
		String[][] food = new String[][] { { "Pan" }, { "Agua" } };
		return Arrays.asList(food);
	}

	@ParameterizedTest
	@MethodSource("Fridge")
	public void TestPut(String food) {
		f1.put(food);
		assertTrue(true == food.isEmpty());

	}

	@ParameterizedTest
	@MethodSource("Fridge")
	public void Testcontains(String food) {
		f1.contains(food);
		assertTrue(food.contains(food));

	}

	@ParameterizedTest
	@MethodSource("Fridge")
	public void Testtake(String food) throws NoSuchItemException {
		f1.take(food);

	}

}
