package driverConfiguration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import static com.github.webdriverextensions.Bot.*;


public class DriverHelper {

    private String testWebsite = "https://www.e-pneu.ro/";

    /**
     * Click on an element present on website
     *
     * @param element -Element to be clicked on
     */

    public void clickElement(WebElement element) {
        click(element);
        waitFor(3);
    }

    /**
     * Setup browser instance for test and configuration
     */
    public void setup() {
        driver().get(testWebsite);
        driver().manage().window().maximize();
    }

    /**
     * Closes each driver instance and all the windows opened
     */
    public void closeDriverInstance() {
        //driver().close();  ( Close just one window )
        driver().quit();
    }

    /**
     * @param link WebElement link from the page to use
     * @return return the current WebElement on the page
     */
    public String returnHref(WebElement link) {
        return link.getAttribute("href");
    }


    /**
     * @param link verify the page URL to be correct
     */
    public void verifyPageUrl(String link) {
        assertCurrentUrlContains(link);
    }


    /**
     * @param element WebElement from the dropdown page to use
     * @param indx    The index of the dropdown where to navigate
     */
    public void selectDrop(WebElement element, int indx) {
        Select drop = new Select(element);
        drop.selectByIndex(indx);

    }


}




