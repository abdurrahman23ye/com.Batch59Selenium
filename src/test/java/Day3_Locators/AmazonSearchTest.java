package Day3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Integer.parseInt;

public class AmazonSearchTest {
    public static void main(String[] args) {
       /* 1. Bir class oluşturun : AmazonSearchTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

                a.google web sayfasına gidin. https://www. amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. “Shopping” e tıklayın.
        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        */

        //a
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //b

        WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));

        arama.click();
        arama.sendKeys("city bike");
        arama.submit();

        //c

        WebElement sonuc=driver.findElement(By.xpath("//*[contains(text(),'1-16 of')]"));

        String sonuc1=(sonuc.getText()).replace("1-16 of ","")
                .replace(" results for","");

        System.out.println(sonuc1);



        //d: Shopping diye bir alan bulamadım.

        //e

        WebElement ilkResim=driver.findElement(By.xpath("//img[@data-image-index='1']"));

        ilkResim.click();

        driver.close();




    }
}
