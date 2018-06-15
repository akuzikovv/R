package RealiseMe.com.CustomDriver;

import net.thucydides.core.webdriver.DriverSource;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CustomChromeDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
//        if (SystemUtils.IS_OS_WINDOWS) {
//            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromeDriver\\chromedriverWin.exe");
//        }
//        DesiredCapabilities ignoreAlert = new DesiredCapabilities();
//        ignoreAlert.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);
        return eventDriver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
