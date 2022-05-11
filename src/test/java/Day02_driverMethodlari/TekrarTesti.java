package Day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) {
        /*
        1. Yeni bir class olusturun (TekrarTesti)

        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
                (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. Sayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Sayfayi kapatin

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        System.out.println("Test-1");

        driver.get("https://www.youtube.com");

        String titleTest=driver.getTitle();

        if (titleTest.equals("youtube")){
            System.out.println("Test-1: Passed");
        }else {
            System.out.println("test-1: Failed");
            System.out.println("Actuel Title:"+ titleTest);
        }


        System.out.println("Test-2:");

        String url=driver.getCurrentUrl();

        if (url.contains("youtube")){
            System.out.println("Test-2: Passed");
        }else{
            System.out.println("test-2: Failed");

            System.out.println("ActuelURL = " + url);
        }

        driver.get("https://www.amazon.com/");

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();

        System.out.println("Test-3");



        String actuelTitle=driver.getTitle();

        if (actuelTitle.contains("Amazon")){
            System.out.println("Test-3: Passed");
        }else {
            System.out.println("test-3: Failed");
            System.out.println("Actuel Title:"+ actuelTitle);
        }

        System.out.println("Test-4:");

        String actuelURL=driver.getCurrentUrl();

        if (actuelURL.equals("https://www.amazon.com/")){
            System.out.println("Test-4: Passed");
        }else{
            System.out.println("test-4: Failed");

            System.out.println("ActuelURL = " +actuelURL );
        }

        driver.close();







    }
}
