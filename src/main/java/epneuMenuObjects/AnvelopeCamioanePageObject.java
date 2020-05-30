package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class AnvelopeCamioanePageObject extends DriverHelper {

    public AnvelopeCamioanePageObject(){
        PageFactory.initElements(driver(),this);
    }


//region Elements of the page to use
    /*Main Menu Navigation*/

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;

    /* Dropdown Search Menu*/

    @FindBy(how = How.ID, using = "2latime_camioane")
    private WebElement latimeAnvelopeCamioane;

    @FindBy(how = How.ID, using = "2inaltime_camioane")
    private WebElement inaltimeAnvelopeCamioane;

    @FindBy(how = How.ID, using = "2diametru_camioane")
    private WebElement diametruAnvelopeCamioane;

    @FindBy(how = How.ID, using = "2cauta-anvelope-camioane")
    private WebElement anvelopeCamioaneSearchButton;

    /* Send offers on email ( to be validated )!!!!*/

    @FindBy(how = How.CSS, using = "input[name='email_client']")
    private WebElement insertEmailOffersAuto;

    @FindBy(how =How.CSS, using = "#oferta" )
    private WebElement submitButtonSend;

    /* Select Dropdown By Popularity (To be validated!!!!)*/

    @FindBy(how = How.CSS, using = ".sorter select")
    private List<WebElement> dropdownPopularitySelectList;

//endregion

    //region Methods to call

    public void searchAnvelopeCamioanePret(){
    }

    public void sendEmailOffer(){
    }

    public void searchAnvelopeCamioaneTip(){
    }


    public void searchAnvelopeCamioaneSezon(){
    }


    public void searchAnvelopeCamioaneLatime(){
    }
    //endregion
}
