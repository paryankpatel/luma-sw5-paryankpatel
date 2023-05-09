package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WomenPage extends Utility {

   // Mouse Hover on Women Menu
   @CacheLookup
   @FindBy(xpath ="//a[@id='ui-id-4']//span[contains(text(),'Women')]" )
   WebElement womenMenu ;
   // Mouse Hover on Tops
   @CacheLookup
   @FindBy(linkText = "Tops")
   WebElement tops;
   // Click on Jackets
   @CacheLookup
   @FindBy(linkText = "Jackets")
   WebElement clickOnJackets;
   @CacheLookup
   @FindBy(xpath = "//div[2]//div[3]//select[1]")
   WebElement selectByFilterProductName;
   @CacheLookup
   @FindBy(xpath = "//select[@id='sorter']")
   WebElement selectByFilterPrice;

   public void mouseHoverOnWomen() {
      mouseHoverToElement(womenMenu);
      Reporter.log("Click on   " +womenMenu.toString());
      CustomListeners.test.log(Status.PASS, "Women tab" +womenMenu);
   }
   public void mouseHoverOnTop() {
      mouseHoverToElement(tops);
      Reporter.log("Mouse hover and click   " +tops.toString());
      CustomListeners.test.log(Status.PASS, "Top tab" +tops);
   }
   public void clickOnJacket(){
      clickOnElement(clickOnJackets);
      Reporter.log("Click on   " +clickOnJackets.toString());
      CustomListeners.test.log(Status.PASS, "Jacket tab" +clickOnJackets);
   }
   public void selectFiletrFromDropDownList() {
      clickOnElement(selectByFilterProductName);
      Reporter.log("Select from drop down menu  " +selectByFilterProductName.toString());
      CustomListeners.test.log(Status.PASS, "select product name" +selectByFilterProductName);
   }
   public  void setSelectByFilterPrice(){
      selectByValueFromDropDown(selectByFilterPrice,"price");
      Reporter.log("Select from drop down menu   " +selectByFilterPrice.toString());
      CustomListeners.test.log(Status.PASS, "select price" +selectByFilterPrice);
   }
}

