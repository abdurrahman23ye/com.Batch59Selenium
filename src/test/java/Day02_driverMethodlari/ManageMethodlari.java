package Day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        System.out.println(driver.manage().window().getSize());// pencere ölçüleri


        driver.manage().window().setSize(new Dimension(700,600));//ölçü değiştirme

        System.out.println(driver.manage().window().getPosition());//pencere konumu
        driver.manage().window().setPosition(new Point(15,15));//pencere konum değiştirme

        driver.manage().window().maximize();//büyüt
        driver.manage().window().fullscreen();//tam ekran
        driver.manage().window().minimize();//görev çubuğuna indir.

    }
}
