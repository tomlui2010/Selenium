package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Soldpage {

	public WebDriver driver;

	public boolean validateSoldpageTitle() {
		
		Logger logger = Logger.getLogger(Soldpage.class);
		
		PropertyConfigurator.configure("Log4j.properties");

		try {

			Assert.assertEquals(driver.getTitle(), "Sold Houses, Apartments, Units, Flats and New Developments | Real Estate | Domain");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}

}
