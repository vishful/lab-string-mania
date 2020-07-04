package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utility.StringMethod;

public class TestStringMethod {
	StringMethod sm = new StringMethod();

	@Test
	public void testSetInputsMethod() {
		sm.setInput("Java");
		assertEquals("Java", sm.getInput());
		try {
			sm.setInput(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLowerMethod() {
		assertEquals("hai", sm.lower("HaI"));
		assertEquals("1234", sm.lower("1234"));
		assertEquals("hai&hello", sm.lower("hai&HELLO"));
		assertEquals("welcome", sm.lower("welcome"));
		try {
			sm.lower("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testUpperMethod() {
		assertEquals("HAI", sm.upper("HAI"));
		assertEquals("1234", sm.upper("1234"));
		assertEquals("HAI&HELLO", sm.upper("hai&HELLO"));
		assertEquals("WELCOME", sm.upper("welcome"));
		try {
			sm.upper("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testFirstCharacterMethod() {
		assertEquals("1", sm.first("1.hai"));
		assertEquals("@", sm.first("@hai"));
		assertEquals(" ", sm.first(" hai"));
		assertEquals("h", sm.first("hai"));
		try {
			sm.first(" ");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testLengthMethod() {
		assertEquals("0", sm.len(""));
		assertEquals("15", sm.len(" WelcomeToJava "));
		assertEquals("4", sm.len("123 "));
		assertEquals("1", sm.len("."));
		try {
			sm.len("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testTrimMethod() {
		assertEquals("Java", sm.trimmer(" Java "));
		assertEquals("Ja va", sm.trimmer("Ja va "));
		assertEquals("Java", sm.trimmer("  Java  "));
		try {
			sm.trimmer("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}
}
