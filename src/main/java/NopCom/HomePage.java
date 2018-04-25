package NopCom;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void openElectronicPage(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //driver.findElement(By.linkText("Electronics")).click();

        clickElement(By.linkText("Electronics"));
        captureScreenShot("Electronic "+randomDate());
    }
    public void openJewelryPage(){
        clickElement(By.linkText("Jewelry"));
        captureScreenShot("Jewelry "+randomDate());

    }
}
