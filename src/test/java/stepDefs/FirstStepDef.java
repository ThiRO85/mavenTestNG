package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstStepDef {

    //WebDriver driver;

    @Given("Launch the browser")
    public void launchTheBrowser() {
        System.out.println("Launch the browser");
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();

        //WebDriverManager.chromiumdriver().setup();
        //ChromeOptions opt = new ChromeOptions().setBinary("C:\\Selenium\\BraveBrowserSetup32.exe");
        //WebDriver driver = new ChromeDriver(opt);
        //driver.get("https://www.google.com");
        //driver.findElement(By.name("q")).sendKeys("Selenium");
    }

    @When("Hit Google on your browser")
    public void hitGoogleOnYourBrowser() {
        System.out.println("Hit Google on your browser");
    }

    @Then("Enter {string} in the search text box")
    public void enterInTheSearchTextBox(String string) {
        System.out.println("Enter " + string + " in the search text box");
    }

    @And("Select the first result")
    public void selectTheFirstResult() {
        System.out.println("Select the first result");
    }
}
