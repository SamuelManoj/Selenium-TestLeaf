package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MergeLeads {
    public static void main(String[] args) {
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
        driver.findElement(By.linkText("Merge Leads")).click();

        driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.findElement(By.name("id")).sendKeys("10093");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement from = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("10093")));
        from = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("10093")));
        from.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.findElement(By.name("id")).sendKeys("10094");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement to = wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("10094")));
        to.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        driver.findElement(By.xpath("//a[text()='Merge']")).click();

    }
}
