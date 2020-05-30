package epneuMenuObjects;

import driverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;

public class ContactPageObject extends DriverHelper {

    public ContactPageObject(){
        PageFactory.initElements(driver(),this);
    }


    //region Elements of the page to use
    /*Main Menu Navigation*/

    @FindBy(how = How.CSS, using = ".main-nav a")
    private List<WebElement> mainMenuNavigationButtons;

    @FindBy(how = How.ID, using = "name")
    private WebElement insertName;

    @FindBy(how = How.ID, using = "email")
    private WebElement insertEmail;

    @FindBy(how = How.ID, using = "telephone")
    private WebElement insertTelephone;

    @FindBy(how = How.ID, using = "comment")
    private WebElement insertComment;

    @FindBy(how = How.CSS, using = "button.btn.btn-epneu1")
    private WebElement buttonTrimite;

    //endregion

// region Methods to be used
    public void contactFormRgistration(){

    }
//endregion
}
