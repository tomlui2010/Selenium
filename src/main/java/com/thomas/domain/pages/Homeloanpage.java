package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
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

}
