/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomas.domain.testcases;

import com.thomas.domain.util.ScreenshotIt;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 *
 * @author tomlui2010 This class will store all the locators and methods of home
 *         page
 */
public class FetchnClick {

	public FetchnClick(WebDriver driver) {

		this.driver = driver;

	}

	public WebDriver driver;

	public List<String> FetchTopNavLinks() {

		final List<WebElement> Linklist = driver.findElements(By.xpath("//*[@class='main-nav-ul']/li/a"));

		List<String> Linkarray = new ArrayList<>();

		for (WebElement link : Linklist) {

			String links = link.getText();

			Linkarray.add(links);

		}

		return Linkarray;
	}

	

	public void ClickTopNavLinks(String lnk_TopNav) throws IOException, InterruptedException {

		ScreenshotIt screenshot = new ScreenshotIt(driver);

		screenshot.Screenshot(lnk_TopNav);

		CapturePageSource(lnk_TopNav);

		GetTitlePage(lnk_TopNav);

		
	}

	public void NavBack() {

		driver.navigate().back();

	}

	public void CapturePageSource(String lnk_TopNav) throws IOException {

		String pagesource = driver.getPageSource();

		String projectLocation = System.getProperty("user.dir");

		File file1 = new File(projectLocation + "\\src\\main\\resources\\htmls\\" + "pagesource_" + lnk_TopNav + ".html");

		FileWriter writer = new FileWriter(file1, true);

		writer.write(pagesource);

		writer.close();

	}

	public void GetTitlePage(String lnk_TopNav) {

		String title = driver.getTitle();

		System.out.println("Page title is: " + title);

		Assert.assertTrue(title.contains((CharSequence) lnk_TopNav));
	}

	public void pageLoadWait(long time) {

		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);

		System.out.println("Waited for " + time + " sec implicitly.");

	}

}
