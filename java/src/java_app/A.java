package java_app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {

	@Test
	
	public void test1() {
		System.out.println("from test 1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("from test 2");
	}
	
	@Before
	public void  beforeTest(){
		System.out.println("before test");
	}
	
	@After
	public void  afterTest(){
		System.out.println("after test");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
