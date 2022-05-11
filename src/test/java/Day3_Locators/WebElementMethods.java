package Day3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

public class WebElementMethods {

    public static void main(String[] args) {
        //amazon'a git

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.tagName("input"));

        if (Objects.equals(aramaKutusu.getTagName(), "input")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

            System.out.println("Actuel tagName:" + aramaKutusu.getTagName());
        }


        if (Objects.equals(aramaKutusu.getAttribute("name"), "field-keyword")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

            System.out.println("Actuel getAttribute:" + aramaKutusu.getAttribute("name"));


        }

    }

}