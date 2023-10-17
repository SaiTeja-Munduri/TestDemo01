package myntra_homefurnishings.TestCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import resources.BaseTest;
import resources.PageObjects;

public class Header_test extends BaseTest
{

	private String expected_men_url = "https://www.myntra.com/shop/men";
	private String expected_women_url = "https://www.myntra.com/shop/women";
	private String expected_kids_url = "https://www.myntra.com/shop/kids";
	private String expected_beauty_url = "https://www.myntra.com/personal-care";
	private String expected_studio_url ="https://www.myntra.com/studio/home?appRoute=%7B%22url%22%3A%22%2Fstudio%2Fhome%22%7D";
	
	@Test(priority =1)
	public void menLinkValidation() throws IOException, InterruptedException
	{
		System.out.println("Validation 1 develop");
		System.out.println("Validation 2 develop");
		initialize();
		PageObjects elements= new PageObjects(driver);
		elements.getMenLink().click();
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_men_url);
	}
	@Test(priority =2)
	public void womenLinkValidation()
	{
		PageObjects elements=new PageObjects(driver);
		
		elements.getWomenLink().click();
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_women_url);
	}
	@Test(priority =3)
	public void kidsLinkValidation()
	{
		PageObjects elements=new PageObjects(driver);
		elements.getKidsLink().click();
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_kids_url);
	}
	@Test(priority =4)
	public void beautyLinkValidation()
	{
		PageObjects elements=new PageObjects(driver);
		elements.getBeautyLink().click();
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_beauty_url);
	}
	@Test(priority =5)
	public void studioLinkValidation()
	{
		PageObjects elements=new PageObjects(driver);
		elements.getStudioLink().click();
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_studio_url);
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();;
	}
}

