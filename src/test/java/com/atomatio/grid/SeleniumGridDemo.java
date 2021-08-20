package com.atomatio.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
    @Test
	public void test1() throws MalformedURLException {
			DesiredCapabilities desiredCapabilities= new DesiredCapabilities();// Just for telling which browser to use so for this obj is created
			desiredCapabilities.setBrowserName("chrome");
			//now we need to set the Operating system by .setPlatform
			desiredCapabilities.setPlatform(Platform.WIN10);
			//so that's all about the configuration
			// Now We are create a object of remote webdriver through which  we will connect to selenium grid
			// here we pass two things 1. URL and Second browser
      WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.5:4444/wd/hub"),desiredCapabilities);
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      System.out.println("Title of the Page is "+driver.getTitle());
      driver.quit();
		
}
}
