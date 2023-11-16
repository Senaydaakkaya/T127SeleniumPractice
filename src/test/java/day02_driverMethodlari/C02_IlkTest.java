package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) throws InterruptedException {

        // testotomasyonu anasayfaya gidin
        // URL'ın https://www.testotomasyonu.com/ oldugunu
        // ve Title'ın test kelimesi icerdigini test edin

        // her test için mutlaka br webdriver olustumalı
        // ve gerekli ayarlamalari yapmaiyiz

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // testotomasyonu anasayfaya gidin

        driver.get("htpps://www.testotomasyonu.com");

        // URL'ın https://www.testotomasyonu.com oldugunu

        String expectedUrl= "https://www.testotomasyonu.com/";
        String actualUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL:"+actualUrl);
        }

        // ve Title'ın test kelimesi icerdigini test edin

        String expectedTitleIcerdigi= "test";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerdigi)){
            System.out.println("Title testi PASSED");

        }else {
        System.out.println("Title testi FAILED");
        System.out.println("Actual title : " + actualTitle);
        }

    }
}
