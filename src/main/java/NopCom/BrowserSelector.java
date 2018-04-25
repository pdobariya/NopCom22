package NopCom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSelector extends Utils {
    public void selectBrowser() {
        String browser = "";
        browser = System.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\Resources\\java\\NopCom\\DriverResources\\geckodriver 0.18.0.exe");
            driver=new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\Resources\\java\\NopCom\\DriverResources\\chromedriver 2.38.55.exe");
            driver=new ChromeDriver();
            }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\Resources\\java\\NopCom\\DriverResources\\IEDriverServer.exe");
            DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
//            capabilities.setCapability("ignoreZoomSetting",true);
//            capabilities.setCapability("nativeEvents",false);
//            capabilities.setCapability("unexpectedAlertBehaviour","accept");
//            capabilities.setCapability("ignoreProtectedModeSettings",true);
//            capabilities.setCapability("desable-popup-blocking",true);
//            capabilities.setCapability("enablePersistentMover",false);
             // capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
//            capabilities.setCapability("requiredWindowFocus",true);

            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);


            driver = new InternetExplorerDriver(capabilities);
            }else {
            System.out.println("Empty Or Wrong Browser Name " +browser);
        }

    }
}
