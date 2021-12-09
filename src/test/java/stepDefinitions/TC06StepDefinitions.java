package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AmazonWebElements;

import java.util.Locale;

public class TC06StepDefinitions {

    AmazonWebElements pages=new AmazonWebElements();

    @When("selects Computer Components")
    public void selects_computer_components() throws InterruptedException {
        //Thread.sleep(3000);
        //System.out.println(pages.computersMenu.size());
        pages.computersMenu.get(3).click();


    }

    @When("selects the Seagate checkbox")
    public void selects_the_Seagate_checkbox() throws InterruptedException {

        pages.seagateCheckbox.click();
        Thread.sleep(2000);
    }

    @Then("verifies that all listed products contain {string} information")
    public void verifies_that_all_listed_products_contain_information(String string) {

        for (int i =0; i<pages.seagateResult.size();i++) {
            System.out.println(pages.seagateResult.get(i).getText());
            Assert.assertTrue(pages.seagateResult.get(i).getText().toLowerCase().contains(string.toLowerCase()));
        }

    }
}
