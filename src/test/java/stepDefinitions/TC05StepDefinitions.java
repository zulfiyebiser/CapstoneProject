package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AmazonWebElements;

public class TC05StepDefinitions {

    AmazonWebElements pages=new AmazonWebElements();

    @When("user clicks to All categories")
    public void user_clicks_to_all_categories() throws InterruptedException {
        Thread.sleep(1000);
        pages.allButton.click();
        Thread.sleep(1000);
    }

    @When("selects Computers")
    public void selects_computers() throws InterruptedException {
        pages.selectComputers.click();
        Thread.sleep(3000);

    }

    @Then("checks that Computers menu has {int} sub categories")
    public void checks_that_computers_menu_has_sub_categories(int int1) {
        Assert.assertEquals(int1,pages.computersMenu.size()-3);



    }
}
