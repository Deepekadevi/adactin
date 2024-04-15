package com.adactin_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinfeature"
,glue = "com\\adactinstepdef",
plugin= {"pretty",
		"html:Report/Cucumber_Reports.html",},
     monochrome=true)
 
public class Runner_Class {

	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}

}
