package com.flip.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {

	WebDriver ldriver;

	public FlipkartPages(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
//	Actions a= new Actions(ldriver);
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']") WebElement fsearch;
	@FindBy(xpath="//button[@class='vh79eN']") WebElement searchButton;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]") WebElement flipkartPrice;
	@FindBy(className="_2zrpKA") WebElement username;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']") WebElement password;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") WebElement loginButton;
	
	// /html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]
	public void userName(){
		username.sendKeys("9705080247");
	}
	public void passWord(){
		password.sendKeys("Khanna73");
	}
	public void login(){
		loginButton.click();
	}
	public void searchFlipkart() {
	//	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title='Search for Products, Brands and More']")));
//		a.moveToElement(fsearch).sendKeys("iPhone XR (64GB) - Yellow").pause(1000).sendKeys(Keys.ENTER).build().perform();
		fsearch.sendKeys("iPhone XR (64GB) - Yellow");
	}

	public void goButtonFlipkart() {

		searchButton.click();
	}
	public String  iphoneF(){
		 return flipkartPrice.getText();
		
	}
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement goButton;
	@FindBy(xpath="//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')]") WebElement iphone;
	@FindBy(xpath="//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//div[@class='s-include-content-margin s-border-bottom']//div[@class='a-section a-spacing-medium']//div[@class='sg-row']//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-small']//div[@class='a-row a-size-base a-color-base']//div[@class='a-row']//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']//span[@class='a-price']//span//span[@class='a-price-whole'][contains(text(),'47,900')]") WebElement amazonPrice;
	
		
	public void searchAmazon() {
		searchBox.sendKeys("iPhone XR (64GB) - Yellow");
	}

	public void goButtonAmazon() {

		goButton.click();
	}
	public String iphoneY(){
		return amazonPrice.getText();
	}

	

}
