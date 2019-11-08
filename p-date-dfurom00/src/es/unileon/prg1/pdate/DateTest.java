package es.unileon.prg1.pdate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTest {
	private Date date;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDate() {
		assertEquals("6/11/2019, this.date.toString");
	}

	@Test
	public void testDateIntIntInt() {
		Date monthWrong= new Date (6,13,2019);
	
	}

	@Test
	public void testIsSameYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		assertEquals("6/11/2019" , this.date.toString())
	}

	@Test
	public void testGetDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSame() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameYearWithoutIf() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameMonthWithoutIf() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameDayWithoutIf() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameWithoutIf() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMonthName() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDaysOfTheMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testDayRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSeason() {
		fail("Not yet implemented");
	}

	@Test
	public void testMonthsLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintDateLeftOfMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintDatesWithSameDays() {
		fail("Not yet implemented");
	}

	@Test
	public void testDaysSinceFirstOfYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumberOfAttemps() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumberOfAttemptsDoWhile() {
		fail("Not yet implemented");
	}

	@Test
	public void testDayOfWeek() {
		fail("Not yet implemented");
	}

}
