package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class GearPage extends Utility {

    // Mouse Hover on Gear Menu
    @CacheLookup
    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[7]")
    WebElement gearMenu;
    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;
    //Click on Product Name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a[contains(text(),'Overnight Duffle ')]")
    WebElement overnightDuffle;
    // // Change Qty 3
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyText;
    @CacheLookup
    @FindBy(id = "qty")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='control qty']//input")
    WebElement changeQty5;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement upDateCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement txtAddedDuffleToCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//span[@class = 'counter-number']")
    WebElement verifyQty3;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[@class='price']")
    WebElement verifyProductPrice;

    @CacheLookup
    @FindBy(xpath = "//span[text() ='$225.00']")
    WebElement verifyProductPrice2;

    public void mouseHoverOnGear() {
        mouseHoverToElement(gearMenu);
        Reporter.log("Mouse hover on  " + gearMenu.toString());
        CustomListeners.test.log(Status.PASS, "Gearmenu" + gearMenu);

    }

    public void clickOnBags() {
        Reporter.log("Click on Bag " + bags.toString());
        CustomListeners.test.log(Status.PASS, "Bags" + bags);
        clickOnElement(bags);
    }

    public void clickOnProductName() {
        clickOnElement(overnightDuffle);
        Reporter.log("Click on overnightDuffle " + overnightDuffle.toString());
        CustomListeners.test.log(Status.PASS, "OvernightDuffle bag" + overnightDuffle);

    }

    public void changeQty() {
        WebElement changeQuantity = driver.findElement(By.id("qty"));
        changeQuantity.sendKeys(Keys.DELETE);
        sendTextToElement(changeQty, "3");
        Reporter.log("Change quantity " + changeQty.toString());
        CustomListeners.test.log(Status.PASS, "Change quantity" + changeQty);


    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        Reporter.log("Add to cart " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Add to cart " + addToCart);
    }

    // Change Qty to ‘5’
    public void changeQty5() {

        WebElement quantityChange = driver.findElement(By.xpath("//div[@class='control qty']//input"));
        quantityChange.sendKeys(Keys.DELETE);
        sendTextToElement(changeQty5, "5");
        Reporter.log("Change quantity to  " + changeQty5.toString());
        CustomListeners.test.log(Status.PASS, "Add to cart " + changeQty5);

    }

    public void updateCart() {
        clickOnElement(upDateCart);
        Reporter.log("Update cart " + upDateCart.toString());
        CustomListeners.test.log(Status.PASS, "Update cart " + upDateCart);
    }

    private void verify(String xpath, String msg) {
        List<WebElement> m1Element = driver.findElements(By.xpath("//strong[@class='product-item-name']"));
        for (WebElement list : m1Element) {
            String name1 = list.getText();
            System.out.println(name1);
            Reporter.log("Verify " + verifyText.toString());
            CustomListeners.test.log(Status.PASS, "Verify text " + verifyText);

        }
    }

    public void clickOnShoppingCart() {
        clickOnElement(clickOnShoppingCart);
        Reporter.log("Click on shoppingCart  " + clickOnShoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Gearmenu" + changeQty);
    }

    public String getProductNameText() {
        Reporter.log("Get product name  " + productName.toString());
        CustomListeners.test.log(Status.PASS, "Product name" + productName);
        return getTextFromElement(productName);
    }

    public String getTextAddedDuffleToCart() {
        Reporter.log("Get text  " + txtAddedDuffleToCart.toString());
        CustomListeners.test.log(Status.PASS, "Get text" + txtAddedDuffleToCart);
        return getTextFromElement(txtAddedDuffleToCart);
    }

    public void getQtyText() {
        Reporter.log("Get quantity text  " + verifyQty3.toString());
        CustomListeners.test.log(Status.PASS, "Get text" + verifyQty3);
        verifyThatElementIsDisplayed(verifyQty3);
    }


    public String getProductPrice() {
        Reporter.log("Get product price " +verifyProductPrice.toString());
        CustomListeners.test.log(Status.PASS,"Get text" +verifyProductPrice);
        return getTextFromElement(verifyProductPrice);

    }
    public String getProductPrice2() {
        Reporter.log("Get product price " +verifyProductPrice2.toString());
        CustomListeners.test.log(Status.PASS,"Get text" +verifyProductPrice2);
        return getTextFromElement(verifyProductPrice2);

    }

}
