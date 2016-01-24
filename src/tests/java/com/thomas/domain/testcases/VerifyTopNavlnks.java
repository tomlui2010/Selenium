/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomas.domain.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thomas.domain.pages.Advicepage;
import com.thomas.domain.pages.Agentspage;
import com.thomas.domain.pages.Buypage;
import com.thomas.domain.pages.Commercialpage;
import com.thomas.domain.pages.Homeloanpage;
import com.thomas.domain.pages.Homepriceguidepage;
import com.thomas.domain.pages.NewHomespage;
import com.thomas.domain.pages.Newspage;
import com.thomas.domain.pages.Placeanadpage;
import com.thomas.domain.pages.Rentpage;
import com.thomas.domain.pages.Sharepage;
import com.thomas.domain.pages.Soldpage;
import com.thomas.domain.pages.Suburbprofilespage;

/**
 *
 * @author tomlui2010
 */
public class VerifyTopNavlnks {

	public WebDriver driver;
	private final String baseurl = "http://www.domain.com.au";

	@BeforeMethod
	public void setup() {

		driver = new FirefoxDriver();
		driver.get(baseurl);

	}

	@Test
	public void VerifyTopNavlnks_Advice() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			Advicepage advicepage = new Advicepage();

			System.out.println(lnk_TopNav.getText());

			if ("Advice".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				advicepage.validateAdvicepageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_Buy() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			Buypage buypage = new Buypage();

			System.out.println(lnk_TopNav.getText());

			if ("Buy".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				buypage.validateBuypageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_Rent() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			Rentpage rentpage = new Rentpage();

			System.out.println(lnk_TopNav.getText());

			if ("Rent".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				rentpage.validateRentpageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_NewHomes() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			NewHomespage newHomespage = new NewHomespage();

			System.out.println(lnk_TopNav.getText());

			if ("New Homes".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				newHomespage.validateNewHomespageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_Sold() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			Soldpage soldpage = new Soldpage();

			System.out.println(lnk_TopNav.getText());

			if ("Sold".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				soldpage.validateSoldpageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_Commercial() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			Commercialpage commercialpage = new Commercialpage();

			System.out.println(lnk_TopNav.getText());

			if ("Commercial".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				commercialpage.validateCommercialpageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_News() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			Newspage newspage = new Newspage();

			System.out.println(lnk_TopNav.getText());

			if ("News".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				newspage.validateNewspageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_Agents() throws IOException, InterruptedException {

		FetchnClick fetchnClick = new FetchnClick(driver);

		List<String> links = fetchnClick.FetchTopNavLinks();

		for (String we : links) {

			WebElement lnk_TopNav = driver.findElement(By.linkText(we));
			
			Agentspage agentspage = new Agentspage();

			System.out.println(lnk_TopNav.getText());

			if ("Agents".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(we);

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				agentspage.validateAgentspageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	}
	
	@Test
	public void VerifyTopNavlnks_Share() throws IOException, InterruptedException {
		
			FetchnClick fetchnClick = new FetchnClick(driver);

			WebElement lnk_TopNav = driver.findElement(By.xpath("//*/li[9]/ul/li[1]/a"));
			
			Sharepage sharepage = new Sharepage();

			System.out.println(lnk_TopNav.getText());

			if ("Share".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(lnk_TopNav.getText());

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				sharepage.validateSharepageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	
	@Test
	public void VerifyTopNavlnks_Homepriceguide() throws IOException, InterruptedException {
		
			FetchnClick fetchnClick = new FetchnClick(driver);

			WebElement lnk_TopNav = driver.findElement(By.xpath("//*/li[9]/ul/li[1]/a"));
			
			Homepriceguidepage homepriceguidepage = new Homepriceguidepage();

			System.out.println(lnk_TopNav.getText());

			if ("Home Price Guide".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(lnk_TopNav.getText());

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				homepriceguidepage.validatehomepriceguidepageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	
	@Test
	public void VerifyTopNavlnks_Suburbprofiles() throws IOException, InterruptedException {
		
			FetchnClick fetchnClick = new FetchnClick(driver);

			WebElement lnk_TopNav = driver.findElement(By.xpath("//*/li[9]/ul/li[1]/a"));
			
			Suburbprofilespage suburbprofilespage = new Suburbprofilespage();

			System.out.println(lnk_TopNav.getText());

			if ("Suburb Profiles".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(lnk_TopNav.getText());

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				suburbprofilespage.validatesuburbprofilespageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	
	@Test
	public void VerifyTopNavlnks_HomeLoans() throws IOException, InterruptedException {
		
			FetchnClick fetchnClick = new FetchnClick(driver);

			WebElement lnk_TopNav = driver.findElement(By.xpath("//*/li[9]/ul/li[1]/a"));
			
			Homeloanpage homeloanpage = new Homeloanpage();

			System.out.println(lnk_TopNav.getText());

			if ("Home Loans".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(lnk_TopNav.getText());

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				homeloanpage.validateHomeloanpageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	
	@Test
	public void VerifyTopNavlnks_Placeanad() throws IOException, InterruptedException {
		
			FetchnClick fetchnClick = new FetchnClick(driver);

			WebElement lnk_TopNav = driver.findElement(By.xpath("//*/li[9]/ul/li[1]/a"));
			
			Placeanadpage placeanadpage = new Placeanadpage();

			System.out.println(lnk_TopNav.getText());

			if ("Place an Ad".equals(lnk_TopNav.getText())) {

				lnk_TopNav.click();

				fetchnClick.ClickTopNavLinks(lnk_TopNav.getText());

				fetchnClick.NavBack();

				fetchnClick.pageLoadWait(5);
				
				placeanadpage.validatePlaceanadpageTitle();				
				

			} else {

				fetchnClick.pageLoadWait(1);

			}
		}
	
	

	@AfterMethod
	public void teardown() {

		driver.quit();

	}

}
