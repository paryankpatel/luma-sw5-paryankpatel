package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    GearPage gearPage ;
    @BeforeMethod(alwaysRun = true)
    public void inIT(){
        // homePage = new HomePage();
       gearPage = new GearPage();
    }

    @Test(groups = {"sanity","regeression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        gearPage.mouseHoverOnGear();
        gearPage.clickOnBags();
        gearPage.clickOnProductName();
        gearPage.changeQty();
        gearPage.clickOnAddToCart();

        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(gearPage.getTextAddedDuffleToCart(), "You added Overnight Duffle to your shopping cart.");

        // Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCart();

        //Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(gearPage.getProductNameText(), "Overnight Duffle");

        // Verify the Qty is ‘3’
        gearPage.getQtyText();
        //Verify the product price ‘$135.00’
        gearPage.getProductPrice();

        //Change Qty to ‘5’
        gearPage.changeQty5();

        //Click on ‘Update Shopping Cart’ button
        gearPage.updateCart();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        //Verify the product price ‘$225.
        Assert.assertEquals(gearPage.getProductPrice2(), "$225.00");
    }
}
