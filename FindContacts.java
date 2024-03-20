package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindContacts {
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

        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Find Contacts")).click();
        driver.findElement(By.xpath("//span[text()='Advanced']")).click();
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("New York");
        driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

//        driver.close();
    }
}
