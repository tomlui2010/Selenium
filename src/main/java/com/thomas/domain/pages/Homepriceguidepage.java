package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Homepriceguidepage {
	
	
	public WebDriver driver;

	public boolean validatehomepriceguidepageTitle() {
		
		Logger logger = Logger.getLogger(Homepriceguidepage.class);
		
		PropertyConfigurator.configure("Log4j.properties");

		try {

			Assert.assertEquals(driver.getTitle(), "Get a free property report with price estimate and history");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}

}
