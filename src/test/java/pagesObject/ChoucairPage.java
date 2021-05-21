package pagesObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.choucairtesting.com/")

public class ChoucairPage extends PageObject{

    @FindBy (xpath = "//li[@id='menu-item-550']//a[@href='https://www.choucairtesting.com/empleos-testing/']")
    WebElementFacade buttonEmpleos;



}
