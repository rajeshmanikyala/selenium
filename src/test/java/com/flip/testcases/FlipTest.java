package com.flip.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.flip.pages.FlipkartPages;

public class FlipTest extends TestBase {

	@Test
	public void flipkartTest() throws InterruptedException {

		driver.get(Furl);
		FlipkartPages fp = new FlipkartPages(driver);

		fp.userName();
		fp.passWord();
		fp.login();
		Thread.sleep(5000);
		fp.searchFlipkart();
		fp.goButtonFlipkart();
		String Fprice = fp.iphoneF();
		System.out.println(Fprice);
		String tes1 = removeCharAt(Fprice, 0);
		driver.navigate().to(Aurl);
		fp.searchAmazon();
		fp.goButtonAmazon();
		String aprice = fp.iphoneY();
		System.out.println(aprice);
		String flipkartprices = removeCharAt(tes1, 2);
		System.out.println(flipkartprices);
		String amazonprices = removeCharAt(aprice, 2);
		System.out.println(amazonprices);

		int flipkartprice = Integer.parseInt(flipkartprices);
		int amazonprice = Integer.parseInt(amazonprices);

		System.out.println(amazonprice);
		System.out.println(flipkartprice);
		if (amazonprice > flipkartprice) {
			System.out.println("Amazon Price is higher");
		} else if (amazonprice < flipkartprice) {
			System.out.println("Flipkart price is higher");
		} else {
			System.out.println("Both Prices are Equal");
		}
	}
}
