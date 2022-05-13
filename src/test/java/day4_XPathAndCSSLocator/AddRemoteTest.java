package day4_XPathAndCSSLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddRemoteTest {

    public static void main(String[] args) {
     /*   Class Work: Add Remove Element

        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

      */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();



        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      WebElement addElement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addElement.click();

      WebElement deletebutonu=driver.findElement(By.xpath("//button[@class='added-manually']"));

      Boolean deleteBottonIsDisplayed=deletebutonu.isDisplayed();

      if (deleteBottonIsDisplayed){

          System.out.println("Test of deletebottonDisplay passed");
      }else {   System.out.println("Test of deletebottonDisplay failed");}

      deletebutonu.click();
        if (addElement.isDisplayed()){

            System.out.println("Test of addElementDisplay passed");
        }else {   System.out.println("Test of addElementDisplay failed");}






    }
}
