package stepDeff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class GooglePageStepDeff {
    WebDriver driver;

    @Given("User is On Google Page")
    public void userIsOnGooglePage() {
        driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("User enters Selenium Tutorial")
    public void userEntersSeleniumTutorial() {
        WebElement searchBox = driver.findElement(By.xpath("//textarea[class='gLFyf']"));
        searchBox.sendKeys("Selenium Tutorial");
        searchBox.submit();
    }

    @Then("Should display Selenium result page")
    public void shouldDisplaySeleniumResultPage() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"Selenium Tutorial -GoogleSearch");
        
        
    
     
    }
}
