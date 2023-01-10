package com.provider.Google;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.google.common.io.Files;

public class Nice {
	@Test(dataProvider ="nick")
	public void Good(String s) {
		
		System.out.println(s);
	}
	
	@DataProvider(name = "nick")
	public String[] create(){
		
		String[] kee = new String[4];
				kee[0] = "abc";
				kee[1] = "123";
				kee[2] = "xyz";
				kee[3] = "456";
				
		return kee; 
	}
	
	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	TakesScreenshot scr = (TakesScreenshot)driver;
	File ope = scr.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ope,new File("./ScreenShot/image1.png"));
}
}
