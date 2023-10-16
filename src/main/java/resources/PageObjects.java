package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects 
{
	WebDriver driver;

	By itemname  = 	By.cssSelector("h1[class='pdp-title']");
	By product   =	By.xpath("//li[@class='product-base']");
	//By info = By.xpath("//li[@class='product-base']/a/div[@class='product-productMetaInfo']/h3");
	By menlink 	 =	By.xpath("//a[@data-group='men']");
	By womenlink =	By.xpath("//a[@data-group='women']");
	By kidslink  =	By.xpath("//a[@data-group='kids']");
	By beautylink =By.xpath("//a[@data-group='beauty']");
	By home_living =By.xpath("//a[@data-group='home-&-living']");
	By studiolink =By.xpath("//a[@data-group='studio']");
	By searchbar = By.cssSelector(".desktop-searchBar");
	By search_list = By.cssSelector("li[class ='desktop-suggestion null']");
	By radiobuttons =By.xpath("//label[@class='common-customRadio gender-label']");
	By profile = By.xpath("//div[@class='desktop-userIconsContainer']");
	By welcome 	= By.xpath("//div[@class = 'desktop-infoTitle']");
	By infotext	= By.xpath("//div[@class = 'desktop-infoEmail']");
	By loginbutton 	= By.xpath("//div[@class='desktop-getUserInLinks desktop-getInLinks']");
	public PageObjects(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	
	public List<WebElement> getProduct()
	{
		return driver.findElements(product);
	}
	
	public WebElement getItemName()
	{
		return driver.findElement(itemname);
	}
	/*public WebElement getInfo()
	{
		return driver.findElement(info);
	}*/
	public WebElement getMenLink()
	{
		return driver.findElement(menlink);
	}
	public WebElement getWomenLink()
	{
		return driver.findElement(womenlink);
	}
	public WebElement getKidsLink()
	{
		return driver.findElement(kidslink);
	}
	public WebElement getHome_LivingLink()
	{
		return driver.findElement(kidslink);
	}
	public WebElement getBeautyLink()
	{
		return driver.findElement(beautylink);
	}
	public WebElement getStudioLink()
	{
		return driver.findElement(studiolink);
	}
	public WebElement getSearchBar()
	{
		return driver.findElement(searchbar);
	}
	public List<WebElement> getSearchList()
	{
		return driver.findElements(search_list);
	}
	public List<WebElement> getRadiobuttons()
	{
		return driver.findElements(radiobuttons);
	}
	public WebElement getProfile()
	{
		return driver.findElement(profile);
	}
	public WebElement getWelcome()
	{
		return driver.findElement(welcome);
	}
	public WebElement getInfoText()
	{
		return driver.findElement(infotext);
	}
	public WebElement getLoginbutton()
	{
		return driver.findElement(loginbutton);
	}
}
