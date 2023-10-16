package myntra_homefurnishings.TestCases;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import resources.BaseTest;
import resources.PageObjects;

public class Profile_test extends BaseTest
{
	private String expected_welcome = "Welcome";
	private String expected_infomessage = "To access account and manage orders";
	@Test
	public void profileValidation() throws IOException, InterruptedException
	{
		
		initialize();
		PageObjects elements= new PageObjects(driver);
		WebElement profile = elements.getProfile();
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();;
		String welcomeText = elements.getWelcome().getText();
		Assert.assertEquals(welcomeText , expected_welcome);
		String infomessage = elements.getInfoText().getText();
		Assert.assertEquals(infomessage, expected_infomessage);
		elements.getLoginbutton().click();
		String loginurl =driver.getCurrentUrl();
		boolean res = loginurl.contains("login");
		Assert.assertTrue(res);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();;
	}

}
