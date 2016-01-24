/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomas.domain.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author tomlui2010
 */
public class ScreenshotIt {

    File scrFile = null;

    public ScreenshotIt(WebDriver driver) {
        this.driver = driver;
    }

    private final WebDriver driver;

    /**
     *
     * This method will take the screen shot and compare it with the existing screen shot to check for accuracy
     * @param lnk_TopNav
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public void Screenshot(String lnk_TopNav) throws IOException, InterruptedException {
        
    	scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	String projectLocation = System.getProperty("user.dir");            
        File file_actual = new File(projectLocation + "\\src\\main\\resources\\screenshots\\screenshot_" + lnk_TopNav + ".png");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        FileUtils.copyFile(scrFile, file_actual);      

    }

}
