package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Placeanadpage {

	public WebDriver driver;

	public boolean validatePlaceanadpageTitle() {
		
		Logger logger = Logger.getLogger(Placeanadpage.class);
		
		PropertyConfigurator.configure("Log4j.properties");

		try {

			Assert.assertEquals(driver.getTitle(), "Place an Ad - Advertise with Domain - Home");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}

}
