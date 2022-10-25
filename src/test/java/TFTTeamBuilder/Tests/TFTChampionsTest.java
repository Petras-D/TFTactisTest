package TFTTeamBuilder.Tests;

import TFTTeamBuilder.Page.TFTChampionsPage;
import org.testng.annotations.Test;

public class TFTChampionsTest extends BaseTestTFTChampions {
    @Test
    public void SearchChampionByCosts(){
        TFTChampionsPage tft=new TFTChampionsPage( chrome);
tft.ChoseCostOfChampions(2);
tft.ChosseChampion("Yone", chrome);
    }
    @Test
    public void SearchChampionByOrigin(){
        TFTChampionsPage tft=new TFTChampionsPage( chrome);
tft.ChoseoriginOfChampion("Astral");
        tft.ChosseChampion("Lux", chrome);
    }
}
