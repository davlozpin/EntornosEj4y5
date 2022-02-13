package boletinJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Subscripcion.class, PilaTest.class, OperadorAritmeticoTest.class, FridgeTest.class, BoaTest.class,
		AccountTest.class })
public class AllTests {

}