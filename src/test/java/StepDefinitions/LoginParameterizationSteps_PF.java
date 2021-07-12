package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;

public class LoginParameterizationSteps_PF {
    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("+++++ I am inside this class +++++");
        System.out.println("Inside Step - browser is openn");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is " + projectPath);

        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);


    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {

        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);

        Thread.sleep(2000);
    }


    @And("user clicks on login")
    public void user_clicks_on_login() throws InterruptedException {

        login.clickOnLogin();

        Thread.sleep(2000);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {

        home = new HomePage_PF(driver);
        home.checkLogOutIsDisplayed();

        driver.close();
        driver.quit();

    }
}
