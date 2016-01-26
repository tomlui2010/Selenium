package com.thomas.domain.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Homeloanpage {

	public WebDriver driver;

	public boolean validateHomeloanpageTitle() {
		
		Logger logger = Logger.getLogger(Homeloanpage.class);
		
		PropertyConfigurator.configure("Log4j.properties");

		try {

			Assert.assertEquals(driver.getTitle(), "Home Loans");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}
	
	// Get all the links

		public void VerifyAllLinks(WebDriver driver) {
			
			List<WebElement> ele = driver.findElements(By.tagName("a"));
			
			System.out.println("size:" + ele.size());
			
			int isValid;
			
			for (int i = 0; i < ele.size(); i++) {
				
				String nextHref = ele.get(i).getAttribute("href");
				
				isValid = getResponseCode(nextHref);
				
				if(isValid > 0){
					
					System.out.println("isValid = " + isValid + ". Hence, Valid URL." );
					
				}else{
					
					System.out.println("isValid = " + isValid + ". Hence, Invalid URL.");				
				};
			}

		}

		public static int getResponseCode(String urlString) {
			
			try {
				
				URL u = new URL(urlString);
				
				HttpURLConnection h = (HttpURLConnection) u.openConnection();
				
				h.setRequestMethod("GET");
				
				h.connect();
				
				return h.getResponseCode();

			} catch (MalformedURLException e) {
				
				return -1;
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			return 0;
		}


}
