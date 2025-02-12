package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnAlert {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com");
        driver.manage().window().maximize();

        // click browser icon
        driver.findElement(By.xpath("//i[contains(@class,'pi pi-globe')]")).click();

        //click alert page
        driver.findElement(By.xpath("//a[contains(@href,'/alert.xhtml')]")).click();

        //1. simple dialog
        driver.findElement(By.xpath("//span[text()='Show']")).click();

        //switch to alert
        Alert alert = driver.switchTo().alert();

        //get text
        System.out.println(alert.getText());

        //accept alert
        alert.accept();
        System.out.println(driver.findElement(By.id("simple_result")).getText());

        //2. Confirm Dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

        //switch to alert
        Alert alert1 = driver.switchTo().alert();

        //get text
        System.out.println(alert1.getText());

        //accept alert
        alert1.dismiss();
        System.out.println(driver.findElement(By.id("result")).getText());

        //3. Sweet Dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();

        //switch to alert
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

        //4. Sweet Modal Dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();

        //switch to alert
        driver.findElement(By.xpath("(//a[@role='button']//span)[2]")).click();

        //5. Alert Prompt Dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

        //switch to alert
        Alert alert4 = driver.switchTo().alert();

        //get text
        System.out.println(alert4.getText());

        //accept alert
        alert4.sendKeys("Test");
        alert4.accept();

        //get text
        String userEnteredName = driver.findElement(By.id("confirm_result")).getText();
        System.out.println(userEnteredName);

        //6. Sweet Alert (Confirmation)
        driver.findElement(By.xpath("//span[text()='Delete']")).click();

        //switch to alert
        driver.findElement(By.xpath("//span[text()='Yes']")).click();

        //get text
        String userEntered = driver.findElement(By.id("confirm_result")).getText();
        System.out.println(userEntered);

    }
}
