package RealiseMe.com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * The class contains common methods for working with page elements
 *
 * @author Aleksandr Antonenko
 * @version 1.0
 * @since 2020-09-09
 */
public class CorePageObjects extends PageObject {

    /**
     * Switches to browser's tab by number
     *
     * @param numberOfTab the integer value that is a number of tab
     * @author Aleksandr Antonenko
     */
    public void switchToTab(int numberOfTab) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(numberOfTab - 1));
    }

    /**
     * Focuses on element by xpath and presses enter
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public void focusOnElementAndPressEnter(String xpath) {
        getElementByXpath(xpath).sendKeys(Keys.ENTER);
    }

    /**
     * Focuses on element by xpath and presses esc
     *
     * @param xpath the string that is a path to the element
     * @author Vladyslav Butko
     */
    public void focusOnElementAndPressEsc(String xpath) {
        getElementByXpath(xpath).sendKeys(Keys.ESCAPE);
    }

    /**
     * Accepts alert message.
     *
     * @author Aleksandr Antonenko
     */
    public void proceedWarningPopup() {
        getDriver().switchTo().alert().accept();
    }

    /**
     * Opens a new tab of browser
     *
     * @author Aleksandr Antonenko
     */
    public void openNewTab() {
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        switchToTab(2);
    }

    /**
     * Gets url of opened page
     * Returns string that is a url
     *
     * @author Aleksandr Antonenko
     */
    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    /**
     * Reloads a page
     *
     * @author Aleksandr Antonenko
     */
    public void reloadPage() {
        getDriver().navigate().refresh();
    }

    /**
     * Clicks on browser's back button
     *
     * @author Aleksandr Antonenko
     */
    public void clickOnBrowserSBackButton() {
        getDriver().navigate().back();
    }

    /**
     * Stops going for provided seconds
     *
     * @param sec the integer value that is a number of seconds
     * @author Aleksandr Antonenko
     */
    public void waitSec(int sec) {
        waitABit(sec * 1000);
    }


    /**
     * Scrolls up the page to the top using JS Executor
     *
     * @author Aleksandr Antonenko
     */
    public void scrollUpThePageToTheTop() {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    /**
     * Stops going for provided milliseconds
     *
     * @param msec the integer value that is a number of milliseconds
     * @author Aleksandr Antonenko
     */
    public void waitMSec(int msec) {
        waitABit(msec);
    }

    /**
     * Opens page by url
     *
     * @param url the url of the page to open
     * @author Aleksandr Antonenko
     */
    public void goToURL(String url) {
        getDriver().get(url);
    }

    /**
     * Clears browser's cookies
     *
     * @author Vladyslav Butko
     */
    public void clearCookies() {
        getDriver().manage().deleteAllCookies();
    }

    /**
     * Uploads file
     *
     * @author Vladyslav Butko
     */
    public void uploadsFile(String xpath, String fileName) {
        getElementByXpath(xpath).sendKeys(System.getProperty("user.dir") + "/src/test/resources/files/" + fileName);
    }

    /**
     * @param xpath
     *
     * @author Vladyslav Butko
     */
    public void moveToElement(String xpath) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(xpath)).build().perform();
    }

    /**
     * Checks if simple checkbox is selected.
     * true - if checkbox is selected,
     * false - if checkbox is not selected.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean simpleCheckboxIsSelected(String xpath) {
        return getElementByXpath(xpath).isSelected();
    }

    /**
     * Clicks on element by xpath.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public void clickOnElementByXpath(String xpath) {
        boolean staleElement = true;
        while (staleElement) {
            try {
                scrollToElementByXpathUsingJsExecutor(xpath);
                $(xpath).click();
                staleElement = false;
            } catch (StaleElementReferenceException ignored) {
            }
        }
    }

    /**
     * Switch to iFrame.
     * iFrame is used to navigate through elements and attributes in an XML document.
     *
     * @param iFrame the string that is a path to the element
     * @author Vladyslav Butko
     */
    public void switchToIFrame(String iFrame) {
        getDriver().switchTo().frame(iFrame);

    }

    /**
     * Exit from iFrame.
     * iFrame is used to navigate through elements and attributes in an XML document.
     *
     * @author Vladyslav Butko
     */
    public void exitFromIFrame() {
        getDriver().switchTo().defaultContent();

    }

    /**
     * Clicks on element by xpath using JavascriptExecutor library.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public void clickOnElementByXpathUsingJsExecutor(String xpath) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", $(xpath));
    }

    /**
     * Scrolls to an element by xpath using JavascriptExecutor library.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the url of the page to open
     * @author Aleksandr Antonenko
     */
    public void scrollToElementByXpathUsingJsExecutor(String xpath) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", $(xpath));
    }

    /**
     * Clicks on element (WebElementFacade type).
     *
     * @param element the WebElementFacade that is an element to click
     * @author Aleksandr Antonenko
     */
    public void clickOnWebElement(WebElementFacade element) {
        element.click();
    }

    /**
     * Clicks on element by id.
     * ID is a unique identifier of element
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public void clickOnElementById(String id) {
        find(By.id(id)).click();
    }

    /**
     * Waits default time for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element is visible on the page.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsInvisible(String xpath) {
        try {
            waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param sec   integer value that describes seconds for waiting
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsInvisible(int sec, String xpath) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param xpath        the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsInvisibleWaitMilliseconds(int milliseconds, String xpath) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits default time for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element is visible on the page.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsInvisible(String id) {
        try {
            waitFor(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param sec integer value that describes seconds for waiting
     * @param id  the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsInvisible(int sec, String id) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element stays to be visible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param id           the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsInvisibleWaitMilliseconds(int milliseconds, String id) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits default time for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element is not visible on the page.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsVisible(String xpath) {
        try {
            waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param sec   integer value that describes seconds for waiting
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsVisible(int sec, String xpath) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param xpath        the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByXpathIsVisibleWaitMilliseconds(int milliseconds, String xpath) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits default time for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element is not visible on the page.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsVisible(String id) {
        try {
            waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in seconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param sec integer value that describes seconds for waiting
     * @param id  the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsVisible(int sec, String id) {
        try {
            withTimeoutOf(sec, ChronoUnit.SECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits provided time (in milliseconds) for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element stays to be invisible on the page
     *
     * @param milliseconds integer value that describes seconds for waiting
     * @param id           the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public boolean elementByIdIsVisibleWaitMilliseconds(int milliseconds, String id) {
        try {
            withTimeoutOf(milliseconds, ChronoUnit.MILLIS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.id(id)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns a web element by id.
     * ID is a unique identifier of element
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public WebElementFacade getElementById(String id) {
        return find(By.id(id));
    }

    /**
     * Returns a web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public WebElementFacade getElementByXpath(String xpath) {
        return find(By.xpath(xpath));
    }

    /**
     * Returns a text from a web element by id.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public String getTextFromElementById(String id) {
        return find(By.id(id)).getText();
    }

    /**
     * Returns a text from a web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public String getTextFromElementByXpath(String xpath) {
        return find(By.xpath(xpath)).getText();
    }

    /**
     * Returns a text from a web element.
     *
     * @param element the WebElementFacade obj that is a web element
     * @author Aleksandr Antonenko
     */
    public String getTextFromElement(WebElementFacade element) {
        return element.getText();
    }

    /**
     * Returns an argument from "value" attribute of web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public String getValueFromElementByXpath(String xpath) {
        return $(xpath).getAttribute("value");
    }

    /**
     * Returns an argument from "value" attribute of web element by id.
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public String getValueFromElementById(String id) {
        return find(By.id(id)).getAttribute("value");
    }

    /**
     * Removes value from input web element by id
     *
     * @param id the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public void clearInputFieldById(String id) {
        find(By.id(id)).clear();
    }

    /**
     * Removes value from input web element by xpath
     *
     * @param xpath the string that is an identifier of the element
     * @author Aleksandr Antonenko
     */
    public void clearInputFieldByXpath(String xpath) {
        find(By.xpath(xpath)).clear();
    }

    /**
     * Waits for visibility of an input field web element by id
     * and types a text into this field
     *
     * @param id   the string that is an identifier of the element
     * @param text the string that is a text to type
     * @author Aleksandr Antonenko
     */
    public void typeTextIntoInputFieldById(String id, String text) {
        waitFor(ExpectedConditions.visibilityOf(find(By.id(id)))).typeInto(find(By.id(id)), text);
    }

    /**
     * Waits for visibility of an input field web element by xpath
     * and types a text into this field
     *
     * @param xpath the string that is a path to the element
     * @param text  the string that is a text to type
     * @author Aleksandr Antonenko
     */
    public void typeTextIntoInputFieldByXpath(String xpath, String text) {
        waitFor(ExpectedConditions.visibilityOf(find(By.xpath(xpath)))).typeInto(find(By.xpath(xpath)), text);
    }

    /**
     * Returns an argument from provided attribute of web element by xpath.
     *
     * @param xpath     the string that is a path to the element
     * @param attribute the string that is a name of the attribute to get
     * @author Aleksandr Antonenko
     */
    public String getAttributeFromElementByXpath(String xpath, String attribute) {
        return $(xpath).getAttribute(attribute);
    }

    /**
     * Returns an argument from provided attribute of web element by id.
     *
     * @param id        the string that is an identifier of the element
     * @param attribute the string that is a name of the attribute to get
     * @author Aleksandr Antonenko
     */
    public String getAttributeFromElementById(String id, String attribute) {
        return find(By.id(id)).getAttribute(attribute);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should not have '@disabled' attribute.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsEnabledByAttribute(String xpath) {
        String newXpath = xpath + "[not(@disabled)]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have '@disabled' attribute.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsDisabledByAttribute(String xpath) {
        String newXpath = xpath + "[@disabled]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have 'class' attribute that contains 'active' text within the argument.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsActiveByClass(String xpath) {
        String newXpath = xpath + "[contains(@class,'active')][not(contains(@class,'inactive'))]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have 'class' attribute that contains 'checked' text within the argument.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsCheckedByClass(String xpath) {
        String newXpath = xpath + "[contains(@class,'checked')]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should have 'class' attribute that contains 'active' text within the argument.
     * Checks if element is invisible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsNotActiveByClass(String xpath) {
        String newXpath = xpath + "[not(contains(@class,'active')) or contains(@class, 'inactive')]";
        return elementByXpathIsVisible(newXpath);
    }

    /**
     * Builds a new xpath with additional condition for an element:
     * the condition says that element should not have 'class' attribute that contains 'checked' text within the argument.
     * Checks if element is visible by such xpath on a page and returns boolean value.
     *
     * @param xpath the string that is a path to the element
     * @author Aleksandr Antonenko
     */
    public boolean elementIsNotCheckedByClass(String xpath) {
        String newXpath = xpath + "[contains(@class,'checked')]";
        return elementByXpathIsInvisible(newXpath);
    }

    /**
     * Finds list of web elements by xpath
     * Creates a new list and puts only visible elements into the list
     * Returns new list of visible only elements
     *
     * @param xpath the string that is a path to the list of elements
     * @author Aleksandr Antonenko
     */
    public List<WebElementFacade> getListWithVisibleElements(String xpath) {
        List<WebElementFacade> list = findAll(xpath);
        List<WebElementFacade> newList = new ArrayList<>();
        for (WebElementFacade element : list) {
            if (element.isVisible())
                newList.add(element);
        }
        return newList;
    }
}



