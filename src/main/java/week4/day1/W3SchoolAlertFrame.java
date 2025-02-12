package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class W3SchoolAlertFrame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);

        driver.switchTo().frame(0);
        String value = driver.findElement(By.xpath("//body/h2")).getText();
        System.out.println(value);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println(value);
    }
}
