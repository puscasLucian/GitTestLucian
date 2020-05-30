package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class PromotiiPageObject extends DriverHelper {

    public PromotiiPageObject(){
        PageFactory.initElements(driver(),this);
    }

    //region Elements on the page to use
    /*Main Menu Navigation*/

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;


    /* Send offers on email ( to be validated )!!!!*/

    @FindBy(how = How.CSS, using = "input[name='email_client']")
    private WebElement insertEmailOffersAuto;

    @FindBy(how =How.CSS, using = "#oferta" )
    private WebElement submitButtonSend;


    /* Select Dropdown By Popularity (To be validated!!!!)*/

    @FindBy(how = How.CSS, using = ".sorter select")
    private List<WebElement> dropdownPopularitySelectList;

//endregion to use
}
