package myntra_homefurnishings.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import resources.BaseTest;
import resources.PageObjects;

public class Filter_test extends BaseTest
{
	@Test
	public void filterValidation() throws IOException, InterruptedException
	{
		System.out.println("Test 00005468464");
		System.out.println("Test 0001111");

		
		initialize();
		PageObjects elements= new PageObjects(driver);
		List<WebElement>radiobuttons = elements.getRadiobuttons();
		for(WebElement radiobutton :radiobuttons)
		{
			radiobutton.findElement(By.xpath("input")).isSelected();
			Assert.assertFalse(radiobutton.isSelected());
			radiobutton.click();
			Boolean res = radiobutton.findElement(By.xpath("input")).isSelected();

					//radiobutton.isSelected();
			Assert.assertTrue(res);

			//System.out.println("is Radio button selected After click  "+radiobutton.isSelected());
		}
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();;
	}
}
