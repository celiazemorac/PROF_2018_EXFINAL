package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

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

	
}
