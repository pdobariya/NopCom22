package NopCom;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils{
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectBrowser();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
//    @AfterMethod
//    public void closeBrowser(ITestResult result){
//        if (ITestResult.FAILURE==result.getStatus()){
//            String file=result.getName()+ randomDate();
//            captureScreenShot(file);
//        }
//        driver.quit();
//    }
    @AfterMethod
    public void closeBrowser(ITestResult result){
        if (ITestResult.FAILURE==result.getStatus()){
            String file=result.getName()+ randomDate();
            try {
                takeFullScreenShotWithUrl(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.quit();

    }
}

