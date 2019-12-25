package qsp;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo 
{
    @Parameters({"Country" , "city"})
	@Test
	public void getDetails(String Country, String city)
	{
		Reporter.log(Country, true);
		Reporter.log(city,true);
	}
}
