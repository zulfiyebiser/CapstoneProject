package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonWebElements;
import utilities.ConfigReader;

public class TC09StepDefinitions {
    AmazonWebElements pages =new AmazonWebElements();

    @Then("user enters valid email")
    public void users_enters_valid_email() {

        pages.emailtextbox.sendKeys(ConfigReader.getProperty("validemail"));
    }

    @Then("user enters valid password")
    public void userEntersValidPassword() {
        pages.passwordTextBox.click();
        pages.passwordTextBox.sendKeys(ConfigReader.getProperty("validpassword"));
        pages.signIn.click();

    }

    @And("verifies that Hello, Login text on the sign in button")
    public void verifiesThatHelloLoginTextOnTheSignInButton() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(pages.movetoLogin.getText());
        Assert.assertTrue(pages.movetoLogin.getText().contains(ConfigReader.getProperty("signInText")));
    }
}
