package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonWebElements;

public class TC02StepDefinitions {

    AmazonWebElements pages=new AmazonWebElements();

    @When("the search results are displayed")
    public void the_search_results_are_displayed() {

        Assert.assertTrue(pages.searchResult.isDisplayed());
    }

    @Then("the search results has the {string} in it")
    public void the_search_results_has_the_in_it(String value) {

        Assert.assertTrue(pages.searchResult.getText().contains(value));

    }
}
