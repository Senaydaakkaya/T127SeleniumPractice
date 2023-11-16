package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_getMethodlari {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(30000);

        driver.get("https://wisequarter.com");
        Thread.sleep(30000);

        // driver.get("www.youtube.com");
        // driver.get () https:// yazılmadan calısmaz

        driver.get("https://youtube.com");


        driver.close();
    }
}
