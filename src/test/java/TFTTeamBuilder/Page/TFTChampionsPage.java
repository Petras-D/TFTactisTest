package TFTTeamBuilder.Page;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//li [@category='Origin']")
    public List<WebElement> Origins;

    @FindBy(xpath = "//li [@category='Class']")
    public List<WebElement> Class;




    public TFTChampionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void ChoseCostOfChampions(int cost) {
        CostChampion.get(cost - 1).click();
    }
public void ChoseoriginOfChampion(String Originss, WebDriver chrome ){


    for (WebElement Origin : Origins) {
chrome.findElement(By.xpath("/html/body/div[1]/div/section/div[5]/div[1]/ul[2]/li")).click();
        if (Origin.getAttribute("name").equals(Originss)) {
            System.out.println("jest");
            Origin.click();
            softAssert.assertEquals(Origin.getAttribute("class"),"filters-item selected");
            break;

        }
    }



}

    public void ChoseClassOfChampion(String Classdatas ){
        for (WebElement classs : Class) {

            if (classs.getAttribute("name").equals(Classdatas)) {
                classs .click();
                softAssert.assertEquals(classs.getAttribute("class"),"filters-item selected");
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


