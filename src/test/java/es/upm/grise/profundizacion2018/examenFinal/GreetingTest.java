package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void smokeTest1() {
		Greeting greeting = spy(new Greeting(new MyCalendar()));
		when(greeting.getHour()).thenReturn(8);
		
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = spy(new Greeting(new MyCalendar()));
		when(greeting.getHour()).thenReturn(8);
		
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		
		Greeting greeting = spy(new Greeting(new MyCalendar()));
		when(greeting.getHour()).thenReturn(8);
		
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}
	
	@Test
	public void smokeTest4(){
		Greeting greeting = spy(new Greeting(new MyCalendar()));
	
		greeting.getGreeting(null);
		verify(greeting, times(1)).getDefaultLanguage();
		verify(greeting, times(1)).getMessage(Language.ENGLISH,TimeOfTheDay.MORNING);
	}

 	@Test
	public void smokeTest5(){
 		Greeting greeting = spy(new Greeting(new MyCalendar()));
		
 		greeting.getGreeting(Language.SPANISH);
		verify(greeting, times(0)).getDefaultLanguage();
		verify(greeting, times(1)).getMessage(Language.SPANISH,TimeOfTheDay.MORNING);
	}

	
}
