package day01_seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebdriverOlusturma {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");

        // Bu satır olusturacagımız web driver'ın ozelliklerini set ediyor
        // webdriver otomasyon sırasında bizim elimiz, gözümüz her şeyimizdir


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.close();

    }
}
