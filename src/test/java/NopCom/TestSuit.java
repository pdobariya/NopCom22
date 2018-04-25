package NopCom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    String ExpectedElectronicResult = "Electronics";
    String ExpectedJewelryResult = "Jewelry";

    @Test
    public void electronicPage(){
        homePage.openElectronicPage();
        Assert.assertEquals(driver.findElement(By.linkText("Electronics")).getText(),ExpectedElectronicResult);
        System.out.println("Electronic Page is Open , Result Is PASS");
    }
    @Test
    public void jewelryPage(){
        homePage.openJewelryPage();
        Assert.assertEquals(driver.findElement(By.linkText("Jewelry")).getText(),ExpectedJewelryResult);
        System.out.println("Jewelry Page is Open , Result Is PASS");

    }

}
