package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class MenPage extends Utility {

    // Mouse Hover on Men Menu
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']//span[contains(text(),'Men')]")
    WebElement menMenu ;

    // Mouse Hover on Bottoms
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-18']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement bottoms;

    //Click on Pants
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-23']//span[contains(text(),'Pants')]" )
    WebElement clickOnPants;
    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectFromDropDown;
    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']" )
    WebElement cronusYogaPant ;

    // Click on Pants
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement cronusPant32;
    @CacheLookup
    @FindBy(xpath ="//div[@id='option-label-color-93-item-49']" )
    WebElement blackColour;
    @CacheLookup
    @FindBy(xpath ="//div[@id='option-label-color-93-item-49']" )
    WebElement cronusBlackColour;

    @CacheLookup
    @FindBy(xpath = "//form[@action='https://magento.softwaretestingboard.com/checkout/cart/add/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary']")
    WebElement buttonAddToCart;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath ="//div[@data-product-id='880']" )
    WebElement productName ;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page messages']//a[contains(text(),'shopping cart')]" )
    WebElement shoppingCart ;
    @CacheLookup
    @FindBy(xpath ="//select[@id='sorter']" )
    WebElement selectByProductName ;
    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]" )
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//main[@id='maincontent']//h1")
    WebElement verifyShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyProductName;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyProductSize ;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColour ;



    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
        Reporter.log("Mouse hover on  " + menMenu.toString());
        CustomListeners.test.log(Status.PASS, "Men menu " + menMenu);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
        Reporter.log("Mouse hover on  " +bottoms.toString());
        CustomListeners.test.log(Status.PASS, "Bottom tab" +bottoms);
    }
    public void clickOnPants(){
        clickOnElement(clickOnPants);
        Reporter.log("Click on " +clickOnPants.toString());
        CustomListeners.test.log(Status.PASS, "Pant tab" +clickOnPants);
    }
    // Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
    public void cronusYogaPantAndClickOnSize32(){
       mouseHoverToElementAndClick(cronusYogaPant);
        Reporter.log("Mouse hover and click on   " +cronusYogaPant.toString());
        CustomListeners.test.log(Status.PASS, "Yoga pant" +cronusYogaPant);
    }
//Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.

    public void cronusYogaPantAndColourBlack(){
        clickOnElement(blackColour);
        Reporter.log("Mouse hover and click on   " +blackColour.toString());
        CustomListeners.test.log(Status.PASS, "Black colour" +blackColour);
    }
    public void mouseHoverOnProductName(){
        mouseHoverToElementAndClick(productName);
        Reporter.log("Mouse hover and click " +productName.toString());
        CustomListeners.test.log(Status.PASS, "Product name" +productName);
    }
    public void addToCart(){
        clickOnElement(addToCart);
        Reporter.log("Click on   " +addToCart.toString());
        CustomListeners.test.log(Status.PASS, "add to cart" +addToCart);
        //mouseHoverToElementAndClick(addToCart,"Add to Cart");
        List<WebElement> multiElement = driver.findElements(By.xpath("//div[@class='message-success success message']"));

        System.out.println("Total Items are: " + multiElement.size());
        for (WebElement list : multiElement) {
            String name1 = list.getText();
            System.out.println(name1);

        }

    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCart);
        Reporter.log("Click on  " +shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Shopping cart" +shoppingCart);
    }

    public void sortByProductName() {
        selectByVisibleTextFromDropDown(selectByProductName, "Product Name");
        Reporter.log("Select by visible text  " +selectByProductName.toString());
        CustomListeners.test.log(Status.PASS, "select product name" +selectByProductName);
    }

    public void clickOnCronousSize32() {
       mouseHoverToElementAndClick(cronusPant32);
        Reporter.log("Click on   " +cronusPant32.toString());
        CustomListeners.test.log(Status.PASS, "Pant" +cronusPant32);
    }

    public void clickOnCronousBlack() {
        mouseHoverToElementAndClick(cronusBlackColour);
        Reporter.log("Click on   " +cronusBlackColour.toString());
        CustomListeners.test.log(Status.PASS, "Black colour" +cronusBlackColour);
    }

    public void mouseHoverOnCronusYogaAndClickAddCart() {
        mouseHoverToElement(productName);
        Reporter.log("Mouse hover on  " +productName.toString());
        CustomListeners.test.log(Status.PASS, "Product name" +productName);
    }
    public void clickOnAddCart(){
     mouseHoverToElementAndClick(addToCart);
        Reporter.log("Click on   " +addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Button and add to cart" +addToCart);
    }

    public String getSuccessMsgText() {
        Reporter.log("Get text  " +successMessage.toString());
        CustomListeners.test.log(Status.PASS, "Messege" +successMessage);
        return getTextFromElement(successMessage);

    }

    public String getShoppingCartText() {
        Reporter.log("Get text  " +verifyShoppingCartText.toString());
        CustomListeners.test.log(Status.PASS, "Verify Messege" +verifyShoppingCartText);
        return getTextFromElement(verifyShoppingCartText);
    }

    public String getProductName() {
        Reporter.log("Get name  " +verifyProductName.toString());
        CustomListeners.test.log(Status.PASS, "Verify Product" +verifyProductName);
        return getTextFromElement(verifyProductName);
    }

    public String getProductSize() {
        Reporter.log("Get size  " +verifyProductSize.toString());
        CustomListeners.test.log(Status.PASS, "Verify Messege" +verifyProductSize);
        return getTextFromElement(verifyProductSize);
    }

    public String getProductColour() {
        Reporter.log("Get colour  " +verifyProductColour.toString());
        CustomListeners.test.log(Status.PASS, "Verify Messege" +verifyProductColour);
        return getTextFromElement(verifyProductColour);
    }
}
