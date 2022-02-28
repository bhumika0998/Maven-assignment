package com.maven2.assign;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before class");
	}
	
@Before
	public void setup()
	{System.out.println("Before test");}
	
@Test
	public void test1() {
		System.out.println("Test1 executed");
		
	}
	@Test
	public void test2() {
		System.out.println("Test2 executed");
		
	}
@After
public void teardown()
{
	System.out.println("After Test");
}
@AfterClass
public static void afterClass(){
	System.out.println("After Class");
}
}

