package Day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));

        arama.click();
        arama.sendKeys("nutella");
        arama.submit();

        WebElement ilk=driver.findElement(By.className("s-image"));
        ilk.click();

        WebElement secim=driver.findElement(By.className("a-button-input"));
        secim.click();

        WebElement ekle=driver.findElement(By.tagName("input"));
        ekle.click();






















    }
}
