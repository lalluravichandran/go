package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void browserlaunch(String browserName)
	{
		
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
			
	driver.manage().window().maximize();
		
	}
		
    public static void launchUrl(String Url) {
    	
    driver.get(Url);
    }
    
    public static void enterText(WebElement element, String value) {
    	
    element.sendKeys(value);
    
    }
    
    public static void btnClick(WebElement element) {
    	
    element.click();
    }
    
    public static void SelectByIndex(WebElement webElement,int Index)
    {
    Select select=new Select((WebElement)webElement);
    select.selectByIndex(Index);
        }
    public static void SelectByValue(WebElement element,String value) 
    {
    Select select=new Select(element);
    select.selectByValue(value);
        }
    public static void SelectByVisibletext(WebElement element,String text) {
        Select select=new Select(element );
        select.selectByVisibleText(text);
        }
        public static void Screenshot(String location) throws IOException {
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File source=screenshot.getScreenshotAs(OutputType.FILE);
        File destination=new File(location);
       FileUtils.copyFile(source, destination);
        }
        
        public static void clear(WebElement element) {
        element.clear();
        }
}


