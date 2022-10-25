package TFTTeamBuilder.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TFTChampionsPage {

    Assertion softAssert = new SoftAssert();

    @FindBy(xpath = "//li [@class='filters-item']")// in other sets champions can change
    public List<WebElement> CostChampion;

    @FindBy(xpath = "//img [@class='character-icon']")
    public List<WebElement> Champions;

    @FindBy(xpath = "//li [@category='origin']")
    public List<WebElement> Origins;



    public TFTChampionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void ChoseCostOfChampions(int cost) {
        CostChampion.get(cost - 1).click();
    }
public void ChoseoriginOfChampion(String Originss ){
    for (WebElement Origin : Origins) {

        if (Origin.getAttribute("name").equals(Origin)) {
            Origin.click();
            softAssert.assertEquals(Origin.getAttribute("class"),"filters-item selected");
            break;

        }
    }



}



    public void ChosseChampion(String name, WebDriver chrome) {
        String NameLower = name.toLowerCase();
        System.out.println(Champions.size());
        for (WebElement Champ : Champions) {
            System.out.println(Champ.getAttribute("alt"));

            if (Champ.getAttribute("alt").equals(name)) {
                Champ.click();
                break;

            }
        }

        softAssert.assertEquals(chrome.getCurrentUrl(), "https://tftactics.gg/champions/" + NameLower);
        softAssert.fail("zła nazwa bohatera");

    }

}


