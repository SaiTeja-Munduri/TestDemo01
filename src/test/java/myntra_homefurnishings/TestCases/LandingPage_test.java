package myntra_homefurnishings.TestCases;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import resources.BaseTest;
import resources.PageObjects;

public class LandingPage_test extends BaseTest
{

	@Test
	public void nameValidation() throws IOException
	{
		initialize();
		PageObjects element = new PageObjects(driver);
		List<WebElement> products = element.getProduct();
			for (WebElement product: products)
			{	
				String name = product.findElement(By.xpath("a/div[@class='product-productMetaInfo']/h3")).getText();
				//System.out.println(name);
				product.click();	
				Set<String> windowhandles = driver.getWindowHandles();
				Iterator<String> it = windowhandles.iterator();
				while(it.hasNext())
				{
					String parent =it.next();
					String child = it.next();
					driver.switchTo().window(child);
					String elementname = element.getItemName().getText();
					Assert.assertEquals(name, elementname);
					driver.close();
					driver.switchTo().window(parent);
				}
			}	
	}
	
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();;
		}
}
