package TFTTeamBuilder.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TFTBuilderPage {
    @FindBy(xpath = "//div [@class='character-wrapper']")
    public List<WebElement> Champions;
    @FindBy(xpath = "//div [@type='Combined']")
    public List<WebElement> Items;
    @FindBy(xpath = "//div [@class='hex']")
    public List<WebElement> ListofHex;

    @FindBy(xpath = "//input [@class='searchbar-input']")
    public WebElement SearchSummoner;
    @FindBy(xpath = "//img [@class='searchbar-icon']")
    public WebElement FindSummoner;

    @FindBy(xpath = "//div [@class='dropdown']")
    public WebElement ButtonOfRegions;

    @FindBy(xpath = "//button [@class='dropdown-item']")
    public List<WebElement> regions;
@FindBy(xpath = "/html/body/div[1]/div/section/div[5]/div/div[1]/div/div[2]")
public  WebElement ClearTeam;
@FindBy (xpath = "//div [@class='switch-toggle']")
public  WebElement ShowHidePartialTraits;
    @FindBy (xpath = "//div [@class='btn secondary']")
    public  WebElement Shareteam;

    @FindBy (xpath = "/html/body/div[1]/div/section/div[5]/div/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/input")
    public  WebElement InputSearchChamps;
    @FindBy (xpath = "//div [@class='list-sort']")
    public  WebElement AlfabeticalSearch;
    @FindBy (xpath = "//div [@class='list-sort']")
    public  WebElement CostsSearch;
    @FindBy (xpath = "//input [@placeholder='Search by name...']")
    public  WebElement InputSeacrchitem;










    public TFTBuilderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    Assertion softAssert = new SoftAssert();

    public void ListofRegions() throws InterruptedException {
        ButtonOfRegions.click();
        Thread.sleep(100);
        regions.get(2).click();
        SearchSummoner.sendKeys("UmysłŚcisły");// Its My Accunt :)
        softAssert.assertEquals(SearchSummoner.getText(), "UmysłŚcisły");
        FindSummoner.click();
    }

    public int ListofItem() {

        for (WebElement Items : Items) {
            System.out.println(Items.getAttribute("name"));

        }
        return 0;
    }

    public void ListOfchampions() {
        System.out.println(Champions.size());
        for (WebElement champ : Champions) {


            champ.click();

        }
    }
    public  void CleanBench(){
        ListOfchampions();
        ShowHidePartialTraits.click();
        ShowHidePartialTraits.click();
        Shareteam.click();
        SearchSummoner.sendKeys(Keys.CONTROL+"v");
        ClearTeam.click();
    }

    public void DropItemstoChamps(WebDriver chrome) {

        ListOfchampions();
        Actions act = new Actions(chrome);
        act.dragAndDrop(chrome.findElement(By.xpath("/html/body/div[1]/div/section/div[5]/div/div[3]/div[2]/div[3]/div[2]/div[2]/div[1]")), chrome.findElement(By.xpath("/html/body/div[1]/div/section/div[5]/div/div[3]/div[2]/div[1]/div/div[1]")));


    }

    public void searchChamps(){
InputSearchChamps.sendKeys("Leona");
CostsSearch.click();
AlfabeticalSearch.click();

softAssert.assertEquals(AlfabeticalSearch.getText(),Champions.get(3).getText());
    }

    public void searchItems(){
        InputSeacrchitem.sendKeys("Guinsoo's");


        softAssert.assertEquals( InputSeacrchitem.getText(),"Guinsoo's ");
    }
}








