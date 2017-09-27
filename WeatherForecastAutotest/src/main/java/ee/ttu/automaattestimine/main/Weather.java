package ee.ttu.automaattestimine.main;

import java.util.Date;

public class Weather {
	
	private Date todaysDate;
	private Date FirstDaysDate;
	private Date SecondDaysDate;
	private Date ThirdDaysDate;
	private double currentTemperature;
	private double FirstDaysMin;
	private double FirstDaysMax;
	private double SecondDaysMin;
	private double SecondDaysMax;
	private double ThirdDaysMin;
	private double ThirdDaysMax;
	private String coordinates;
	public Date getTodaysDate() {
		return todaysDate;
	}
	public Date getFirstDaysDate() {
		return FirstDaysDate;
	}
	public Date getSecondDaysDate() {
		return SecondDaysDate;
	}
	public Date getThirdDaysDate() {
		return ThirdDaysDate;
	}
	public double getCurrentTemperature() {
		return currentTemperature;
	}
	public double getFirstDaysMin() {
		return FirstDaysMin;
	}
	public double getFirstDaysMax() {
		return FirstDaysMax;
	}
	public double getSecondDaysMin() {
		return SecondDaysMin;
	}
	public double getSecondDaysMax() {
		return SecondDaysMax;
	}
	public double getThirdDaysMin() {
		return ThirdDaysMin;
	}
	public double getThirdDaysMax() {
		return ThirdDaysMax;
	}
	public String getCoordinates() {
		return coordinates;
	}
	
	
	
	
}
