package sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

public class TestOpenBrowser {

    private WebDriver webDriver;

    public TestOpenBrowser() {

        System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEWEBDRIVER")+"\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void testBrowserOpen() throws InterruptedException {
        webDriver.get("http://www.google.com");
        Thread.sleep(10000);
    }
}
