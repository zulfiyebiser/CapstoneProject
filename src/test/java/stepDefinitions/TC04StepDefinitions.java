package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AmazonWebElements;
import utilities.Driver;

public class TC04StepDefinitions {

    AmazonWebElements pages=new AmazonWebElements();

    @When("user searches for {string}")
    public void user_searches_for(String product) {

        pages.searchBox.sendKeys(product+ Keys.ENTER);
    }

    @When("sorts the result from highest price to lowest")
    public void sorts_the_result_from_highest_price_to_lowest() {

        WebDriverWait sortSelectWait = new WebDriverWait(Driver.getDriver(), 10);
        WebElement sortSelect = sortSelectWait.until(ExpectedConditions.elementToBeClickable(pages.sortedList));
        new Select(sortSelect).selectByVisibleText("Price: High to Low");
    }

    @When("clicks second product for details")
    public void clicks_second_product_for_details() throws InterruptedException {
        Thread.sleep(2000);
        pages.secondItem.click();
    }

    @Then("checks product title contains {string}")
    public void checks_product_title_contains(String productTitle) {
        Assert.assertTrue(pages.productTitle.getText().contains(productTitle));
    }
}
