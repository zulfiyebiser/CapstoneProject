package stepDefinitions;

import io.cucumber.java.en.*;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AmazonWebElements;
import utilities.Driver;

public class TC10StepDefinitions {
    AmazonWebElements pages= new AmazonWebElements();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
    String result;

    @Then("selects the first item")
    public void selects_the_first_item() throws InterruptedException {
        Thread.sleep(2000);
        result=pages.result.getText();
        pages.result.click();


    }

    @Then("users clicks add to List button")
    public void users_clicks_add_to_list_button() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)");

        wait.until(ExpectedConditions.visibilityOf(pages.addList));
        pages.addList.click();

    }

//    @Then("selects create new List")
//    public void selects_create_new_list() {
//
//        pages.newList.click();
//        pages.creatList.click();
//
//    }

    @Then("opens to shopping list")
    public void opens_to_shopping_list() {

        wait.until(ExpectedConditions.visibilityOf(pages.viewList));
        pages.viewList.click();
    }

    @Then("checks if the product is in the list")
    public void checks_if_the_product_is_in_the_list() {
        System.out.println(result);
        Assert.assertTrue(pages.productInCart.getText().contains(result));

    }

    @Then("clicks delete button")
    public void clicks_delete_button() {

        pages.delete.click();

    }

    @Then("checks if the product is not in the list")
    public void checks_if_the_product_is_not_in_the_list() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(pages.deleteAssert.isDisplayed());
        //Assert.assertTrue(pages.deleteAssert.getText().contains("Deleted"));

    }


}
