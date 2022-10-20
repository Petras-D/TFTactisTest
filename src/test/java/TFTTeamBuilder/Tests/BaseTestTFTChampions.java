package TFTTeamBuilder.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTestTFTChampions {
    protected WebDriver chrome;

    @BeforeMethod
    public void chromeup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://tftactics.gg/champions");
        Thread.sleep(200);
        chrome.switchTo().frame("sp_message_iframe_679961");


        chrome.findElement(By.xpath("//button[@title='Accept']")).click();

    }

}
