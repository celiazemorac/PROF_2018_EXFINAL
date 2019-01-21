package es.upm.grise.profundizacion2018.examenFinal;

public class Greeting {
	
	MyCalendar my_calendar;
	
	public Greeting (MyCalendar my_calendar) {
		this.my_calendar = my_calendar;
	}
	
	public String getGreeting( Language language ) {
		// Get current hour
		// Calendar calendar = Calendar.getInstance();
		int hour = getHour();
		
		// Find out the greeting language
		if ( language == null )
			// language = Message.getDefaultLanguage();
			language = getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
		// return Message.getMessage( moment, language );
		return getMessage(language, moment);
	}
	
	// Paso 4
	int getHour() {
		return my_calendar.getHourOfTheDay();
	}
	
	// Paso 8
	Language getDefaultLanguage() {
		return Message.getDefaultLanguage();
	}
	
	String getMessage(Language language, TimeOfTheDay moment) {
		return Message.getMessage(moment, language);	
	}		
}
