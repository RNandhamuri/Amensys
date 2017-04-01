package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {
	
	@BeforeSuite // this executes before all files in TestNG Folder or Packet
	public void RefreshOpen()
	{
		System.out.println("Refresh before executing anything");
		
	}

	@AfterSuite // this executes after all files in TestNG Folder or Packet
	public void RefreshClose()
	{
		System.out.println("Refresh after executing everything");
	}
}
