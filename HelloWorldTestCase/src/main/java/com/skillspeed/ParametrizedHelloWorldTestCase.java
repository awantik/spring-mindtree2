package com.skillspeed;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.skillspeed.categories.Mandatory;

@RunWith(Parameterized.class)
@Category(Mandatory.class)
public class ParametrizedHelloWorldTestCase{
	
	// Define parametrized's properties
	private String expected;
	private String actualValue;
	
	
	public ParametrizedHelloWorldTestCase(String expected, String actualValue) throws Throwable {
		// Set values
		this.expected = expected;
		this.actualValue = actualValue;
	}
	
	@Parameters
	public static Collection<Object []> dataParameters(){
		return Arrays.asList(new Object[][] {
				{"Hello World","Hello World"} ,
				{"Hi World","Hi World"}
				});
	}
	
	@Test
	public void testConcatenation(){
		// Print out instance reference and values passed
		System.out.println("Instance Reference :: "+this+" :: Expected :: "+this.expected +" :: ActualValue :: "+this.actualValue);
		assertEquals(this.expected, this.actualValue);
	}

}
