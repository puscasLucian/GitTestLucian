package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class ProducatoriAnvelopePageObject extends DriverHelper {

    public ProducatoriAnvelopePageObject(){
        PageFactory.initElements(driver(),this);
    }

    //region Elements of the page to use

    /*Main Menu Navigation*/

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;

//endregion

    public void selectProducatori(){

    }
}


