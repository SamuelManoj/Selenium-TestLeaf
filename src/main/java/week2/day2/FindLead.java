package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindLead {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        String text = driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12343");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

//        driver.close();
    }
}
