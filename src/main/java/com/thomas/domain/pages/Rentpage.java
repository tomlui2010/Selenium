package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Rentpage {

	public WebDriver driver;

	public boolean validateRentpageTitle() {
		
		Logger logger = Logger.getLogger(Rentpage.class);
		
		PropertyConfigurator.configure("Log4j.properties");

		try {

			Assert.assertEquals(driver.getTitle(), "Rent Houses, Apartments, Units, Flats and New Developments | Real Estate | Domain");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}

}
