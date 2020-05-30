package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class JanteAutoPageObject extends DriverHelper {

    public JanteAutoPageObject(){
        PageFactory.initElements(driver(),this);
    }

    //region Elements of the page to use

    /*Main Menu Navigation*/

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;

    /* Configurator 1 Search Menu*/

    @FindBy(how = How.CSS, using = ".col-sm-4.jante.c1.active")
    private WebElement configutator1PageElement;

    @FindBy(how = How.CSS, using = ".selector")
    private List<WebElement> selectProdAndModel;

    @FindBy(how =How.CSS, using = ".button.coc")
    private WebElement searchButtonVehicul;

    /* Configurator 2 Search Menu*/

    @FindBy(how = How.CSS, using = ".col-sm-4.jante.c2.active")
    private WebElement configutator2PageElement;

    @FindBy(how = How.ID, using = "searchCar_ddlBrands")
    private List<WebElement> dropdownMarcaMasina;

    @FindBy(how = How.ID, using = "searchCar_ddlTypes")
    private List<WebElement> dropdownModelMasina;

    @FindBy(how = How.ID, using = "searchCar_ddlModels")
    private List<WebElement> dropdownMotorizare;

    /* Configurator 3 Search Menu*/

    @FindBy(how = How.CSS, using = ".col-sm-4.jante.c3.active")
    private WebElement configutator3PageElement;
    //endregion

}
