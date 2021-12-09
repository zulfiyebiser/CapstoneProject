package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AmazonWebElements;

import java.util.Locale;

public class TC03StepDefinitions {

    AmazonWebElements pages=new AmazonWebElements();
    String firstItemPrice;

    @Given("user adds first item to basket")
    public void user_adds_to_basket() throws InterruptedException {
        pages.firstItemx.click();
        Thread.sleep(1000);
        firstItemPrice=pages.firstItemPrice.getText().trim();
    }

    @When("user checks basket total")
    public void user_checks_basket_total() throws InterruptedException {

        pages.addToCardButton.click();
        Thread.sleep(2000);
        pages.goToCart.click();
    }

    @Then("it should match the price of the item added into basket")
    public void it_should_match_the_price_of_the_item_added_into_basket() {

        String priceInCart=pages.priceInCart.getText().trim();
//        System.out.println(priceInCart);
//        System.out.println(firstItemPrice);
        Assert.assertEquals(firstItemPrice,priceInCart);

    }
}
