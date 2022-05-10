package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.eksisozluk.com");

        driver.manage().window().fullscreen();//Tam sayfa yap.

        System.out.println(driver.getTitle());//başlığı al.

        System.out.println(driver.getCurrentUrl());//URL'i al.



        driver.close();
    }
}
