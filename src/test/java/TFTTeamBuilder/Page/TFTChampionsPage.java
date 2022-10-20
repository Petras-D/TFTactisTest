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

    @FindBy(xpath = "//li [@class='filters-item']")
    public List<WebElement> CostChampion;

    @FindBy(xpath = "//img [@class='character-icon']")
    public List<WebElement> Champions;



    public TFTChampionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void ChoseCostOfChampions(int cost ) {
        CostChampion.get(cost-1).click();
    }




    public void ChosseChampion(String name,WebDriver chrome){
        String NameLower=name.toLowerCase();
        for (WebElement Champ: Champions){

            if(Champ.getAttribute("alt").equals(name))
            Champ.click();

break;

        }

        softAssert.assertEquals( chrome.getCurrentUrl(),"https://tftactics.gg/champions/"+NameLower);
        softAssert.fail("zła nazwa bohatera");

    }

    }


