package RealiseMe.com.CustomDriver;

import net.serenitybdd.core.time.SystemClock;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;

public abstract class EventHandler    implements WebDriverEventListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventHandler.class);

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        wait(webDriver);
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        wait(webDriver);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    /**
     * Called before {@link WebDriver.Navigation#refresh navigate().refresh()}.
     *
     * @param driver WebDriver
     */
    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    /**
     * Called after {@link WebDriver.Navigation#refresh navigate().refresh()}. Not called,
     * if an exception is thrown.
     *
     * @param driver WebDriver
     */
    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        getWait(2000);
//        webDriver.findElement(By.xpath(ILocators.spinner).getCssValue("display"), "block");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {

    }

//    @Override
//    public void beforeChangeValueOf(WebElement element,
//                                    WebDriver driver) {
//
//    }
//
//    @Override
//    public void afterChangeValueOf(WebElement element,
//                                   WebDriver driver) {
//
//    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    private void getCookie(WebDriver webDriver){
        Cookie cookie = webDriver.manage().getCookieNamed("JSESSIONID");
        if (cookie!=null){
            LOGGER.info(String.format("URL:%s {}",webDriver.getCurrentUrl()),cookie);
        }
    }


    private void wait(WebDriver webDriver){
        SystemClock clock = new SystemClock() {
            @Override
            public void pauseFor(long timeInMilliseconds) {

            }

            @Override
            public ZonedDateTime getCurrentTime() {
                return null;
            }
        };
        clock.pauseFor(10000);

    }

    private void getWait(Integer time)  {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}