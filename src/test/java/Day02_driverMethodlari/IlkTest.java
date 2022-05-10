package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //https://amazon.com'a git.
        //Başlık Amazon içeriyor mu?
        //Url https://amazon.com eşit mi?
        //sayfayi kapatin.

        driver.get("https://amazon.com");

       boolean test1= driver.getTitle().contains("Amazon");

       if (test1){
           System.out.println("passed");
       }else {System.out.println("failed");}


        boolean test2=driver.getCurrentUrl() == "https://amazon.com";



        if (test2){
            System.out.println("passed");
        }else {System.out.println("failed");}



        driver.close();
    }
}
