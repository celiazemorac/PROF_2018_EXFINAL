package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar {
	
	Calendar calendar = Calendar.getInstance();
	private static int hour = MyCalendar.getHourOfTheDay();;
	
	public static void setHourCalendar(int value) {
		hour = value;
	}
	
	public static int getHourOfTheDay() {
		return hour;
	}

}
