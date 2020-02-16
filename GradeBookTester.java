import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {

	
		GradeBook bookA;
		GradeBook bookB;
	@Before
	public void setUp() throws Exception {
		bookA = new GradeBook(5);
		bookB = new GradeBook(5);
		bookA.addScore(75);
		bookA.addScore(90);
		bookA.addScore(94);
		bookB.addScore(15);
		bookB.addScore(40);
		bookB.addScore(72);
	}

	@After
	public void tearDown() throws Exception {
		bookA = null;
		bookB = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(bookA.toString().equals("75.0 90.0 94.0 "));
		assertTrue(bookB.toString().equals("15.0 40.0 72.0 "));
		assertEquals(3,bookA.getScoreSize());
		assertEquals(3,bookB.getScoreSize());
	}

	@Test
	public void testSum() {
		assertEquals(259,bookA.sum(),.0001);
		assertEquals(127,bookB.sum(),.0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(75,bookA.minimum(),0);
		assertEquals(15,bookB.minimum(),0);
	}

	@Test
	public void testFinalScore() {
		assertEquals(184,bookA.finalScore(),0);
		assertEquals(112,bookB.finalScore(),0);
	}

}
