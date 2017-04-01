package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsFlightBooking {
	
@BeforeMethod // this executes before every method
public void UseridGeneration()
{
	System.out.println("UseridGeneration");
	
}

@AfterMethod // this executes after every method
public void TestcasePassed()
{
	System.out.println("Testcase is passed successfully");
}

@BeforeTest // this executes before executing test cases
public void Cookies()
{
	System.out.println("Delete the Cookies before starting the tests");
	
}

@AfterTest
public void Cookiesclose()//this executes after executing all test cases 
{
	System.out.println("Delete Cookies after completing all the tests");
	
}

@Test // This is the test case and execution is based on alpahbetical order
public void OpeningBrowser()
{
	System.out.println("Opening Browser");
	
}
@Test
public void FlightBooking()
{
	System.out.println("FlightBooking");
	
}
}
