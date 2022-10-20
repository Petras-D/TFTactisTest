package TFTTeamBuilder.Tests;

import TFTTeamBuilder.Page.TFTChampionsPage;
import org.testng.annotations.Test;

public class TFTChampionsTest extends BaseTestTFTChampions {
    @Test
    public void SearchChampion(){
        TFTChampionsPage tft=new TFTChampionsPage( chrome);
tft.ChoseCostOfChampions(2);
tft.ChosseChampion("Gnar", chrome);


    }

}
