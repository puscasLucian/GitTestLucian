package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class AnvelopeMotoPageObject extends DriverHelper {

    public AnvelopeMotoPageObject(){
        PageFactory.initElements(driver(),this);
    }

//region Element Of the page to use

    /*Main Menu Navigation*/

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;

    /* Dropdown Search Menu*/



    @FindBy(how = How.ID, using = "2latime_moto")
    private WebElement latimeAnvelopeMoto;

    @FindBy(how = How.ID, using = "2inatime_moto")
    private WebElement inaltimeAnvelopeMoto;

    @FindBy( how = How.ID, using = "2diametru_moto")
    private WebElement diametruAnvelopeMoto;

    @FindBy(how = How.ID, using = "2cauta-anvelope-moto")
    private WebElement anvelopeMotoSearchButton;

//endregion

    public void searchAnvelopeMotoPret(){

    }
}
