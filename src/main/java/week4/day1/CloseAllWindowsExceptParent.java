package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CloseAllWindowsExceptParent {
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

        driver.findElement(By.xpath("//span[text()='Close Windows']/parent::button")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windowHandles);

        for(String eachWindow : list){
            if(!eachWindow.equals(parentWindow)){
                driver.switchTo().window(eachWindow);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
    }
}
