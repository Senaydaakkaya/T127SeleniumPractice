package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        Selenium 4.12 versiyon ile
        kendi Webdriver'ını da olusturabiliyor

        Yani artık dısardan bir webdriver tanımlama MECBURİYETİ kalmadı

        ANCAK... sirketlerin pek cogu kendilerine ozel olarak
        satın aldıkları webdriver'ları kullanabiliyor.

        Biz bu duruma aslısmak ıcın
        Selenium webdriver yerıne indirdigimiz driver.exe dosyasını kullanmaya devam edecegız
         */


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);

       // System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle()); // 061B1F385B3B53EEE1730804DF226B38
        // Window hanndle degeri: selenium'un olusturugu her webdriver objesine verdigi
        //                         uniq bir kod'dur
        //                         Biz bu degerleri birden fazla sayfa acılırsa, sayfalar arasında gecıs yapmak ıcın kullanıcaz

        System.out.println(driver.getWindowHandles());
        // aktif webdriver objesinin tum sayfaların windows handle degerini getirir

        driver.quit();
    }
}
