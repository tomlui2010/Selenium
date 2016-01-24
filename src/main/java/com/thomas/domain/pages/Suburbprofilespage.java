package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Suburbprofilespage {

	public WebDriver driver;

	public boolean validatesuburbprofilespageTitle() {
		
		Logger logger = Logger.getLogger(Suburbprofilespage.class);
		
		PropertyConfigurator.configure("Log4j.properties");
		
		try {

			Assert.assertEquals(driver.getTitle(), "Australian Suburbs Overview - Property Prices & Suburb Profiles");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}

}
