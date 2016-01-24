package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Commercialpage {

	public WebDriver driver;

	public boolean validateCommercialpageTitle() {
		
		Logger logger = Logger.getLogger(Commercialpage.class);
		
		PropertyConfigurator.configure("Log4j.properties");

		try {

			Assert.assertEquals(driver.getTitle(), "Commercial Real Estate and Property For Sale and Lease in Australia | CommercialRealEstate.com.au");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}

}
