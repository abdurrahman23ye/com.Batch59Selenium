package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class HomeWork {

    public static void main(String[] args) {
        /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        6. Tekrar “facebook” sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser’i kapatin

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectedResult="faceboook";
        String actuelResult=driver.getTitle();
        System.out.println("Test-1");
        if(expectedResult==actuelResult){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");

            System.out.println("actuelResult = " + actuelResult);}




        System.out.println();
        System.out.println("Test-2");
        String actuelURL=driver.getCurrentUrl();

        if(actuelURL.contains("facebook")){
            System.out.println("Test passed" );   }else {

            System.out.println("Test failed" );

            System.out.println("actuelURL = " + actuelURL);}




        System.out.println("Test-3");

        driver.get("https://www.walmart.com/");

        boolean test3=driver.getTitle().contains("Walmart.com");

        if(test3){
            System.out.println("Test passed" );   }else {

            System.out.println("Test failed" );

            System.out.println("actuelURL = " + driver.getTitle());

            }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();

        driver.close();






    }

}
