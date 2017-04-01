package TestNG;

import org.testng.annotations.Test;

public class PrioritizingAnnotations {
	@Test // Test A 
	public void OpeningBrowser()
	{
		System.out.println("Opening Browser");
		
	}
	@Test(dependsOnMethods={"OpeningBrowser"},alwaysRun=true) // Test B
	public void FlightBooking()
	{
		System.out.println("FlightBooking");
		
	}
	@Test(enabled=false) // Test C 
	public void Payment()
	{
		System.out.println("Payment Successfull");
		
	}
}
// Test B has to execute after Test A i.e., Test B is dependent on Test A so we use
// (dependsOnMethods = {"methodname of Test case a"})
// and if test a fails and even though if you want to execute test b then we use annotation 
// called alwaysRun=true
// (dependsOnMethods={"methodname of Test case a"},alwaysRun=true)
// Here among this three cases For some reason Test C Execution fails and you want to skip it so we use 
//(enabled=false) annotation