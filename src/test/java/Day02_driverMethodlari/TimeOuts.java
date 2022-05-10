package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TimeOuts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); /* Bir sayfa açılırken elementlerin yüklenmesi için
        zaman ihtiyac vardır. Bu şekilde Maksimum(Bulursa o kadar değil.) 15 saniye elementlerin
        yüklenmesi beklenir.İleride ayrıntlı öğreneceğiz.

        thread.sleep kullanırsak her senaryoda bekleriz.
        */



    }}
