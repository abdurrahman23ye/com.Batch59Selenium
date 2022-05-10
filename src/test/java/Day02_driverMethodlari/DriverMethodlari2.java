package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodlari2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        //Amazon sitesine gidip kaynak kodlarında spend less arat.
        //Amazon sitesine gidip kaynak kodlarında Amazon Exports Sales arat.

        boolean test=driver.getPageSource().contains("spend less");
        boolean test2=driver.getPageSource().contains("Amazon Exports Sales");



        if (test){System.out.println("passed");}else {System.out.println("failed");}
        if (test2){System.out.println("passed");}else {System.out.println("failed");}


    }
}
