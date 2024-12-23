package stepDeff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CRMStepDeff{
    WebDriver driver;

    @Given("User login into app")
    public void userLoginIntoApp() {
        driver = new ChromeDriver();
    
    }

    @When("User create a new Deals")
    public void userCreateANewDeals() {
      System.out.println("Create a new Deals....");
    }

    @When("User view Deals")
    public void userViewDeals() {
        System.out.println("View Deals....");

       
    }

    @When("User Update Deals")
    public void userUpdateDeals() {
        System.out.println("Update a  Deals....");

    }

    @When("User Delete a Deals")
    public void userDeleteDeals() {
        System.out.println("Delete a Deals....");

       
    }
    @When("User Create a Deals")
    public void user_create_a_new_task() {
        System.out.println("Create  a new  task....");

       
    }
}
