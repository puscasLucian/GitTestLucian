package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class LanturiAutoPageObject  extends DriverHelper {

    public LanturiAutoPageObject(){
        PageFactory.initElements(driver(),this);
    }


    //region Elements of the page to use

    /*Main Menu Navigation*/

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;

    /* Dropdown Search Menu*/


    @FindBy(how = How.ID, using = "2latime")
    private WebElement latimeLanturi;

    @FindBy(how = How.ID, using = "2inaltime")
    private WebElement inaltimeLanturi;

    @FindBy(how = How.ID, using = "2diametru")
    private WebElement diametruLanturi;


    /* Unique ID on Search button*/

    @FindBy(how = How.ID, using = "2cauta-lanturi-auto")
    private WebElement lanturiSearchButton;


    /* Send offers on email ( to be validated )!!!!*/

    @FindBy(how = How.CSS, using = "input[name='email_client']")
    private WebElement insertEmailOffersAuto;

    @FindBy(how =How.CSS, using = "#oferta" )
    private WebElement submitButtonSend;

    /* Select Dropdown By Popularity (To be validated!!!!)*/

    @FindBy(how = How.CSS, using = ".sorter select")
    private List<WebElement> dropdownPopularitySelectList;

//endregion


}
