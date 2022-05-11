package Day3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginTest {

  /*  Main method oluşturun ve aşağıdaki görevi tamamlayın.
            a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    i. Username : testtechproed@gmail.com
    ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
            3. Sayfada kac tane link oldugunu bulun.


   */
  public static void main(String[] args) {


     System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.navigate().to("http://a.testaddressbook.com");

    driver.manage().window().maximize();

   WebElement signIn= driver.findElement(By.id("sign-in"));
    signIn.click();

      WebElement eMail= driver.findElement(By.id("session_email"));
      eMail.click();
      eMail.sendKeys("testtechproed@gmail.com");

      WebElement passWord= driver.findElement(By.id("session_password"));
      passWord.click();
      passWord.sendKeys("Test1234!");

      WebElement signIn2= driver.findElement(By.name("commit"));
      signIn2.click();

      WebElement gMail= driver.findElement(By.className("navbar-text"));



      String text=gMail.getText();

      if(text.equals("testtechproed@gmail.com"))  { System.out.println("Test passed");
  } else {
    System.out.println("Test failed");}

      WebElement adresses=driver.findElement(By.linkText("Addresses"));

      Boolean adressesGorunurMu=adresses.isDisplayed();

      if(adressesGorunurMu) { System.out.println("Test passed");
      } else {
        System.out.println("Test failed");}

    WebElement signOut=driver.findElement(By.linkText("Sign out"));

    Boolean signOutGorunurMu=signOut.isDisplayed();

    if(signOutGorunurMu) { System.out.println("Test passed");
    } else {
      System.out.println("Test failed");}

    List<WebElement>linkler=new ArrayList<>();

    linkler=driver.findElements(By.tagName("a"));

    System.out.println("Kaç link var? "+linkler.size());


    driver.close();







}}
