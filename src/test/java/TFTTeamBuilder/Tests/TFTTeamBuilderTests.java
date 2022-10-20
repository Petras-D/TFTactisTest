package TFTTeamBuilder.Tests;

import TFTTeamBuilder.Page.TFTBuilderPage;
import org.testng.annotations.Test;

public class TFTTeamBuilderTests extends baseTestTFTTeamBuilter {
    @Test
    public void FiilHExWirhChamps() {
        TFTBuilderPage tft = new TFTBuilderPage(chrome);
        tft.ListOfchampions();
    }

    @Test
    public void SuitUpChampions() {
        TFTBuilderPage tft = new TFTBuilderPage(chrome);
        System.out.println(tft.ListofHex.size());
        System.out.println(tft.Items.size());
        tft.DropItemstoChamps(chrome);
    }

    @Test
    public void SearchASummoner() throws InterruptedException {
        TFTBuilderPage tft = new TFTBuilderPage(chrome);
        tft.ListofRegions();

    }

    @Test
    public void ClearTeam() {
        TFTBuilderPage tft = new TFTBuilderPage(chrome);
        tft.CleanBench();


    }
    @Test
public void SearhChampionByAZ(){
    TFTBuilderPage tft = new TFTBuilderPage(chrome);
    tft.searchChamps();

}
@Test
    public void SearhItemByCosts(){
        TFTBuilderPage tft = new TFTBuilderPage(chrome);
        tft.searchItems();


    }
}
