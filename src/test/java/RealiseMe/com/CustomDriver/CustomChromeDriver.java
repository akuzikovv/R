package RealiseMe.com.CustomDriver;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomChromeDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
//        if (SystemUtils.IS_OS_WINDOWS) {
//            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromeDriver\\chromedriverWin.exe");
//        }
//        DesiredCapabilities ignoreAlert = new DesiredCapabilities();
//        ignoreAlert.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--whitelist-ip *");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return eventDriver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}