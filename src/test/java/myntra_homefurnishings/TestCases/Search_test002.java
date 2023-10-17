package myntra_homefurnishings.TestCases;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import resources.BaseTest;
import resources.PageObjects;

public class Search_test002 extends BaseTest
{
	@Test
	public void searchValidation() throws IOException, InterruptedException
	{
		System.out.println("New Changes01");
		System.out.println("New changes02");
		System.out.println("New Changes03");
		System.out.println("New changes04");
		initialize();
		PageObjects elements= new PageObjects(driver);
		elements.getSearchBar().sendKeys("Shirt");
		List<WebElement> searchlist = elements.getSearchList();
		for(WebElement item:searchlist)
		{
			String suggested_text = item.getText();
			Assert.assertTrue(suggested_text.contains("Shirt"));
		}
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();;
	}
}
