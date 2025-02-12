package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LearnWIndowHandles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//span[text()='Browser']/parent::a")).click();
        driver.findElement(By.xpath("//span[text()='Window']")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //1. Click and Confirm new Window Opens
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement openButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[span[text()='Open']]")));
        openButton.click();

        Set<String> allWindows = driver.getWindowHandles();

        System.out.println(allWindows.size());

        List<String> list = new ArrayList<>(allWindows);

        driver.switchTo().window(list.get(1));
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();

    }
}

