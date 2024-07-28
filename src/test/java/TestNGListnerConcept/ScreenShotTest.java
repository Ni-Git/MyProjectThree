package TestNGListnerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTest extends Base {

	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@Test
	public void takeScreenShotTest()
	{
		Assert.assertEquals(false, true);
	}
}
