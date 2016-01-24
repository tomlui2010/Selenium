package com.thomas.domain.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewHomespage {

	public WebDriver driver;

	public boolean validateNewHomespageTitle() {
		
		Logger logger = Logger.getLogger(NewHomespage.class);
		
		PropertyConfigurator.configure("Log4j.properties");

		try {

			Assert.assertEquals(driver.getTitle(), "New Homes | Home & Land Packages | Off the Plan Apartments");

		} catch (Exception e) {
			
			logger.debug(e.toString(),e);

			return false;
		}
		return true;

	}

}
