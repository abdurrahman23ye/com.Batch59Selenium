package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());//Benzersiz olarak açılan windowun hascodunu verir
        //Bu kodlarla sayfalar arasında dolaşırız.
    }
}
