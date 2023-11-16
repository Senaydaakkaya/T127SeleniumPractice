package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_DriverMethodlari {
    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wisequarter.com");
        //driver.navigate().to("https://www.wisequarter.com"); // aynı işlemi görür
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize(); // pencereyi menüleri gizlemeden büyük hale getirir
       // driver.manage().window().fullscreen(); // menüleri de gizleyerek tüm ekranı kaplar



        driver.quit();
    }
}
