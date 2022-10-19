package TFTTeamBuilder.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTestTFT {
    protected WebDriver chrome;

    @BeforeMethod
    public void chromeup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://tftactics.gg/team-builder");
        Thread.sleep(200);
        chrome.switchTo().frame("sp_message_iframe_679961");


        chrome.findElement(By.xpath("//button[@title='Accept']")).click();

    }


}
