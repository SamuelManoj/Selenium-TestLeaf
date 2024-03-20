package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginCreateLead {
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

        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company_name");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("name");
        WebElement eleSource = driver.findElement(By.name("dataSourceId"));
        Select select = new Select(eleSource);
        select.selectByVisibleText("Employee");
        driver.findElement(By.name("firstNameLocal")).sendKeys("test");
        driver.findElement(By.name("lastNameLocal")).sendKeys("name");
        driver.findElement(By.className("smallSubmit")).click();

        String title = driver.getTitle();
        if (title.equals("View Lead | opentaps CRM")) {
            System.out.println("Title is proper");
        } else {
            System.err.println("Title is not correct");
        }

        String name_text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        System.out.println(name_text);
        System.out.println(name_text.replaceAll("\\D",""));

//        driver.close();
    }
}
