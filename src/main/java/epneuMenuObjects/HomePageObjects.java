package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class HomePageObjects extends DriverHelper {

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;

    // region ElementsOnPage

    @FindBy(how = How.CSS, using = ".__ra-desktop-vs")
    private WebElement closeFirst;

    @FindBy(how = How.CSS, using = ".__ra-desktop-vs a")
    private List<WebElement> closeSecond;

    @FindBy(how = How.ID, using = "tab_auto")
    private WebElement menuAutoDropdown;

    /* Search Menu Dropdown Auto */
    @FindBy(how = How.ID, using = "1latime")
    private WebElement dropdownLatime;

    @FindBy(how = How.ID, using = "1inaltime")
    private WebElement dropdownInaltime;

    @FindBy(how = How.ID, using = "1diametru")
    private WebElement dropdownDiametru;

    @FindBy(how = How.ID, using = "1brand")
    private WebElement dropdownBrands;

    @FindBy(how = How.ID, using = "1sezon")
    private WebElement dropdownSezon;

    @FindBy(how = How.ID, using = "cauta-anvelope-auto")
    private WebElement searchButtonAuto;

    @FindBy(how = How.ID, using = "tab_camioane")
    private WebElement menuCamioaneDropdown;


    /*Search Menu Dropdown Camioane */
    @FindBy(how = How.ID, using = "1latimeC")
    private WebElement dropdownLatimeCamioane;
    @FindBy(how = How.ID, using = "1inaltimeC")
    private WebElement dropdownInaltimeCamioane;
    @FindBy(how = How.ID, using = "1diametruC")
    private WebElement dropdownDiametruCamioane;
    @FindBy(how = How.ID, using = "1brandC")
    private WebElement dropdownBrandsCamioane;
    @FindBy(how = How.ID, using = "1sezonC")
    private WebElement dropdownSezonCamioane;
    @FindBy(how = How.ID, using = "cauta-anvelope-camioane")
    private WebElement searchButtonCamioane;
    @FindBy(how = How.ID, using = "tab_moto")
    private WebElement menuMotoDropdown;


    /* Search Menu Dropdown Moto*/
    @FindBy(how = How.ID, using = "latimeM")
    private WebElement dropdownLatimeMoto;
    @FindBy(how = How.ID, using = "inaltimeM")
    private WebElement dropdownInaltimeMoto;
    @FindBy(how = How.ID, using = "diametruM")
    private WebElement dropdownDiametruMoto;
    @FindBy(how = How.ID, using = "brandM")
    private WebElement dropdownBrandsMoto;
    @FindBy(how = How.ID, using = "cauta-anvelope-moto")
    private WebElement searchButtonMoto;
    @FindBy(how = How.ID, using = "tab_accesorii")
    private WebElement menuLanturiDropdown;


    /* Search Menu Dropdown Lanturi*/
    @FindBy(how = How.ID, using = "latimeL")
    private WebElement dropdownLatimeLanturi;
    @FindBy(how = How.ID, using = "inaltimeL")
    private WebElement dropdownInaltimeLanturi;
    @FindBy(how = How.ID, using = "diametruL")
    private WebElement dropdownDiametruLanturi;
    @FindBy(how = How.ID, using = "cauta-lanturi")
    private WebElement searchButtonLanturi;

    public HomePageObjects() {
        PageFactory.initElements(driver(), this);
    }


    // endregion


/* Elements on the page if We need to use
    /* Picture promo Anvelope  (to be validated!!!)

    @FindBy(how = How.XPATH, using = "//*[@id='slideshow']/div[2]/div/div[1]/div/a")
    private WebElement picturePromoAnvelope;

    /* DOT-Anvelope Link

    @FindBy( how = How.XPATH, using = "//*[@id='latest_news']/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/h2/a")
    private WebElement linkToDotAnvelope;

    /* Link video Youtube

    @FindBy( how = How.XPATH, using = "//*[@id='latest_news']/div/div/div[1]/div/div[2]/div/div/div/div/div/a")
    private WebElement promoVideo;


    /* "Citeste mai mult" Link rel

    @FindBy(how = How.CSS, using = "a.readmore.btn.btn-default")
    private WebElement citesteMaiMultButton;


    /* Bottom Page List of Products

    @FindBy(how = How.CSS, using = "div.std a")
    private List<WebElement> listOfProductsPageDown;


    /*  Footer Email Submit

    @FindBy(how = How.CSS, using = "#newsletter-footer")
    private  WebElement emailTextInput;


    @FindBy(how = How.CSS, using = "button.button span")
    private WebElement emailSubmitButton;


    /* SocialMedia Icons

    @FindBy(how = How.CSS, using = ".social-icons a")
    private List<WebElement> socialMediaLinkButtons;

*/


    //region Methods To be Call

    /**
     *
     */
    public void navigateMenuItems() {
        for (int i = 0; i < mainMenuNavigationButtons.size(); i++) {
            String urlToVerify = returnHref(mainMenuNavigationButtons.get(i));
            clickElement(mainMenuNavigationButtons.get(i));
            verifyPageUrl(urlToVerify);
        }

    }

    public void searchAnvelopeAutoPret() {

        clickElement(dropdownLatime);
        selectDrop(dropdownLatime,3);
        clickElement(dropdownInaltime);
        selectDrop(dropdownInaltime,4);
        clickElement(dropdownDiametru);
        selectDrop(dropdownDiametru,7);
        clickElement(dropdownBrands);
        selectDrop(dropdownBrands,0);
        clickElement(dropdownSezon);
        selectDrop(dropdownSezon,3);
        clickElement(searchButtonAuto);
        clickElement(mainMenuNavigationButtons.get(0));
    }



    public void searchAnvelopeCamioanePret() {
        clickElement(menuCamioaneDropdown);
        clickElement(dropdownLatimeCamioane);
        selectDrop(dropdownLatimeCamioane,3);
        clickElement(dropdownInaltimeCamioane);
        selectDrop(dropdownInaltimeCamioane,4);
        clickElement(dropdownDiametruCamioane);
        selectDrop(dropdownDiametruCamioane,7);
        clickElement(dropdownBrandsCamioane);
        selectDrop(dropdownBrandsCamioane,0);
        clickElement(dropdownSezonCamioane);
        selectDrop(dropdownSezonCamioane,3);
        clickElement(searchButtonCamioane);
        clickElement(mainMenuNavigationButtons.get(0));
    }

    public void searchAnvelopeMotoPret() {
    }

    public void searchLanturiPret() {
    }

    public void sendEmailOffer() {
    }

//endregion


}
