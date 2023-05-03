import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class CalculatorTest {
static Calculator mycalc;
int num1, num2,expected,result;
@BeforeClass
public static void setupBeforeClass()
{
mycalc = new Calculator(3,3);
}
@Before
public void setUp() throws Exception {
assertTrue(mycalc.validate());
}
@After
public void tearDown() throws Exception {
mycalc.reset();
}
@AfterClass
public static void tearDownAll()
{
mycalc=null;
System.out.println("Memory released after program execution");
}
@Test
public void testAdd() {
result = mycalc.Add();
expected = 6;
assertEquals(result, expected);
}
@Test
public void testSub() {
result = mycalc.Sub();
expected = 0;
assertEquals(result, expected);
}
@Test
public void testDiv() {
result = mycalc.Div();
expected = 1;
assertEquals(result, expected);
}

public static void main(String[] args) {
// TODO Auto-generated method stub
}
}
