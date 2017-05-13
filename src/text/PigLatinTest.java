package text;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PigLatinTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*************************************************************
	 * Test String Conversion
	 *************************************************************/
	
	@Test
	public void testBasic() {
		String s1 = "banana";
		assertEquals("ananabay", PigLatin.pigLatin(s1));
	}

	@Test
	public void testStartsWithVowel() {
		String s1 = "apple";
		assertEquals("appleway", PigLatin.pigLatin(s1));
	}

	@Test
	public void testStartsWithConsonantGroup() {
		String s1 = "string";
		assertEquals("ingstray", PigLatin.pigLatin(s1));
	}
	
	@Test
	public void testOnlyConsonants() {
		String s1 = "hmm";
		assertEquals("hmmway", PigLatin.pigLatin(s1));
	}
	
	@Test
	public void testSymbols() {
		String s1 = "!!!";
		assertEquals("!!!", PigLatin.pigLatin(s1));
	}
	
	@Test
	public void testCapitalLetters() {
		String s1 = "Hello";
		assertEquals("ellohay", PigLatin.pigLatin(s1));
	}
	
	@Test
	public void testMultipleWords() {
		String s1 = "Hello World";
		assertEquals("ellohay orldway", PigLatin.pigLatin(s1));
	}

	@Test
	public void testMultipleWordsPlusPunctuation() {
		String s1 = "Hello World!";
		assertEquals("ellohay orldway!", PigLatin.pigLatin(s1));
	}
}
