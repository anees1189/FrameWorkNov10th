package com.mit.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.mit.common.GoogleBase;
import com.mit.pages.GoogleHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends GoogleBase {
	
	//WebDriver driver;
	
	GoogleHome gh;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		launchBrowser();
		
		
		
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		GoogleHome gh = new GoogleHome(driver);
		gh.enterSearch(string);
		
	}

	@When("I click on the google search button")
	public void i_click_on_the_google_search_button() {
		
		gh.clickSearch();
		
		
	    
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
	    
		closeBrowser();
		
		
	}


}
