package sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestOpenBrowser {

    private WebDriver webDriver;

    public TestOpenBrowser() {
//        try {
//            System.setProperty("webdriver.chrome.driver", System.getenv("path"));
//        }catch (Exception e) {
//            System.out.println("hhh" + e.getMessage());
//        }
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEWEBDRIVER")+"\\chromedriver.exe");
//        System.out.println( System.getenv("CHROMEWEBDRIVER"));
        webDriver = new ChromeDriver();
    }

    @Test
    public void testBrowserOpen() throws InterruptedException {
        webDriver.get("http://www.google.com");
        Thread.sleep(10000);
    }
}
