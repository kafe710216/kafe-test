package edu.selab.kafe_maven;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiffDemoTest {
	
	private DiffDemo diffDemo = new DiffDemo();
	
	@Before
	public void setup(){
	
	}
	
	@Test
	public void testGetDiff(){
		String str1 = "abcde";
		String str2 = "abcxy";
		
		String expected = "xy";
		
		try{
			String diffResult = diffDemo.getDiff(str1, str2);
			assertEquals(expected, diffResult);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
