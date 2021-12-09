package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonWebElements;
import utilities.Driver;

public class TC08StepDefinitions {

    AmazonWebElements pages=new AmazonWebElements();
    Actions actions=new Actions(Driver.getDriver());

    @Then("opens the signin window")
    public void opens_the_signin_window() {

        actions.moveToElement(pages.mainMenu).perform();

    }

    @Then("clicks  Create a List link")
    public void clicks_create_a_list_link() {

        actions.click(pages.createList).perform();
    }

    @Then("Verifies that the title contains {string}")
    public void verifies_that_the_title_contains(String string) {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(),string);

    }
}
