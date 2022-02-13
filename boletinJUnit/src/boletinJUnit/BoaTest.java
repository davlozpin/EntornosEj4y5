package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.stream.Stream;

class BoaTest {
	Boa b1 = new Boa("Pepe", 10, "granola bars");

	@ParameterizedTest
	@MethodSource("methodTest1")
	void test1(boolean expected, Boa boa) {
		assertEquals(expected, boa.isHealthy());
	}

	private static Stream<Arguments> methodTest1() {
		return Stream.of(Arguments.of(true, new Boa("Pepe", 10, "granola bars")),
				Arguments.of(false, new Boa("Manolita", 17, "pan")));
	}

//------

	@ParameterizedTest
	@MethodSource("methodTest2")
	void testFitsInCage(boolean expected, int cm) {
		assertEquals(expected, b1.fitsInCage(cm));
	}

	private static Stream<Arguments> methodTest2() {
		return Stream.of(Arguments.of(true, 22), Arguments.of(false, 2), Arguments.of(false, 10));
	}

}
