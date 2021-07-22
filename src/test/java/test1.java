import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Вход
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("sd@gmail.com");
        driver.findElement(By.name("session[password]")).sendKeys("xcv");
        driver.findElement(By.cssSelector("input[value='Sign in']")).click();
//Добавление
        driver.findElement(By.xpath("//a[@data-test='addresses']")).click();
        driver.findElement(By.xpath("//a[@data-test='create']")).click();
        driver.findElement(By.id("address_first_name")).sendKeys("d");
        driver.findElement(By.id("address_last_name")).sendKeys("c");
        driver.findElement(By.name("address[address1]")).sendKeys("x");
        driver.findElement(By.name("address[address2]")).sendKeys("z");
        driver.findElement(By.id("address_city")).sendKeys("q");
        driver.findElement(By.id("address_city")).sendKeys("q");
        driver.findElement(By.xpath("//option[@value='FL']")).click();
        driver.findElement(By.id("address_zip_code")).sendKeys("r");
        driver.findElement(By.id("address_country_us")).sendKeys("r");
        driver.findElement(By.id("address_birthday")).sendKeys("01.01.1991");
        driver.findElement(By.id("address_color")).sendKeys("#0000FF");
        driver.findElement(By.id("address_age")).sendKeys("2");
        driver.findElement(By.id("address_website")).sendKeys("https://travel.yandex.ru/avia/?clid=2255400-225&utm_source=distribution&utm_medium=bookmark&utm_campaign=ru");
       //driver.findElement(By.id("address_picture")).sendKeys("2");
        driver.findElement(By.id("address_phone")).sendKeys("+375295779529");
        driver.findElement(By.id("address_interest_climb")).click();
        driver.findElement(By.id("address_note")).sendKeys("сммс");
        driver.findElement(By.cssSelector("input[value='Create Address']")).click();
//Редактирование
        driver.findElement(By.xpath("//a [@ data-test='edit']")).click();
        driver.findElement(By.id("address_first_name")).sendKeys("пва");
        driver.findElement(By.id("address_last_name")).sendKeys("впар");
        driver.findElement(By.name("address[address1]")).sendKeys("фвы");
        driver.findElement(By.name("address[address2]")).sendKeys("ыав");
        driver.findElement(By.id("address_city")).sendKeys("ыва");
        driver.findElement(By.id("address_city")).sendKeys("ываы");
        driver.findElement(By.xpath("//option[@value='FL']")).click();
        driver.findElement(By.id("address_zip_code")).sendKeys("ыавпарпо");
        driver.findElement(By.id("address_country_us")).sendKeys("вавп");
        driver.findElement(By.id("address_birthday")).sendKeys("11.12.1234");
        driver.findElement(By.id("address_color")).sendKeys("#0000FF");
        driver.findElement(By.id("address_age")).sendKeys("12");
        driver.findElement(By.id("address_website")).sendKeys("https://travel.yandex.ru/avia/?clid=2255400-225&utm_source=distribution&utm_medium=bookmark&utm_campaign=ru");
        //driver.findElement(By.id("address_picture")).sendKeys("3");
        driver.findElement(By.id("address_phone")).sendKeys("+375292932169");
        driver.findElement(By.id("address_interest_climb")).click();
        driver.findElement(By.id("address_note")).sendKeys("впарппарарапт");
        driver.findElement(By.name("commit")).click();
        //Удаление
        driver.findElement(By.xpath("//a[@data-test='addresses']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Destroy')]")).click();
        driver.switchTo().alert().accept();
        //Выход из системы
        driver.findElement(By.xpath("//a[@data-test='sign-out']")).click();
    Thread.sleep(5000);
       driver.close();
       driver.quit();
    }
}
