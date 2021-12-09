package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AmazonWebElements;

import java.util.Locale;

public class TC07StepDefinitions {
    AmazonWebElements pages=new AmazonWebElements();
    @When("selects the first product listed")
    public void selects_the_first_product_listed() {
        pages.firstItem.click();
    }

    @When("adds to cart")
    public void adds_to_cart() {
        pages.addToCardButton.click();

    }

    @Then("selects Electronics")
    public void selects_electronics() throws InterruptedException {

        pages.selectElectronics.click();
        Thread.sleep(3000);


    }

    @Then("selects Camera & Photo")
    public void selects_camera_photo() throws InterruptedException {

       System.out.println(pages.electronicsMenu.size());
       //pages.electronicsMenu.get(3).getText();
        pages.selectCamera.click();
       Thread.sleep(2000);

    }

    @Then("selects the second product listed")
    public void selects_the_second_product_listed() throws InterruptedException {
        pages.secondItem.click();
        Thread.sleep(2000);


    }

    @Then("Verifies that there are {int} items in the cart")
    public void verifies_that_there_are_items_in_the_cart(Integer int1) throws InterruptedException {

        Thread.sleep(2000);
        String actual=pages.labelTotal.getText().trim().substring(0,10);
        String expected="Subtotal ("+int1+" items):";
        Assert.assertEquals(expected.substring(0,10),pages.labelTotal.getText().trim().substring(0,10));



    }

    @Then("deletes the first item in the cart")
    public void deletes_the_first_item_in_the_cart() throws InterruptedException {

        pages.deleteButton.click();

    }

    @And("goes to cart")
    public void goToCart() {
        pages.goToCart.click();

    }
}
