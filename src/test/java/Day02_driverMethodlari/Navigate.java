package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");//driver.get'in aynısı

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();//geri dön
        driver.navigate().forward();//ileri git

        driver.navigate().refresh();

        driver.close();

    }
}
