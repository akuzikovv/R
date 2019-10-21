package RealiseMe.com.CustomDriver;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        EventHandler handler = new EventHandler() {
            @Override
            public void beforeAlertAccept(WebDriver webDriver) {

            }

            @Override
            public void afterAlertAccept(WebDriver webDriver) {

            }

            @Override
            public void afterAlertDismiss(WebDriver webDriver) {

            }

            @Override
            public void beforeAlertDismiss(WebDriver webDriver) {

            }

            @Override
            public void beforeSwitchToWindow(String s, WebDriver webDriver) {

            }

            @Override
            public void afterSwitchToWindow(String s, WebDriver webDriver) {

            }

            @Override
            public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

            }

            @Override
            public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

            }

            @Override
            public void beforeGetText(WebElement webElement, WebDriver webDriver) {

            }

            @Override
            public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

            }
        };
        eventDriver.register(handler);
        return eventDriver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
