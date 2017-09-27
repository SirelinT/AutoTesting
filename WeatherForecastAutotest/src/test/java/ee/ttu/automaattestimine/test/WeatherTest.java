package ee.ttu.automaattestimine.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import ee.ttu.automaattestimine.main.Weather;

public class WeatherTest {

	Weather weather;
	
	
	@Before
	public void setUp() throws Exception {
		weather = new Weather();
	}

	@Test
	public void testIfTodaysDataIsAvailable() {
		Date date = new Date();
		assertEquals(weather.getTodaysDate(), date.getTime());
	}
	@Test
	public void testIfThreeDaysDataIsAvilable() {
		Date date = new Date();
		assertEquals(weather.getFirstDaysDate(), date.getTime() + 86400000);
		assertEquals(weather.getSecondDaysDate(), date.getTime() + 2*86400000);
		assertEquals(weather.getThirdDaysDate(), date.getTime() + 3*86400000);
	}
	@Test
	public void testIfCoordinatesAreAvailable() {
		assertNotNull(weather.getCoordinates());
		assertTrue(weather.getCoordinates().contains("lat:"));
		assertTrue(weather.getCoordinates().contains("lon:"));
		assertTrue(weather.getCoordinates().length() <= 26);
	}
	@Test
	public void testIfMinTemperatureIsLowerThanMaxTemperature() {
		assertTrue(weather.getFirstDaysMin() < weather.getFirstDaysMax());
		assertTrue(weather.getSecondDaysMin() < weather.getSecondDaysMax());	
		assertTrue(weather.getThirdDaysMin() < weather.getThirdDaysMax());
	}

}
