package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/select.xhtml");
        driver.manage().window().maximize();

//        WebElement eleUIAutomationTool = driver.findElement(By.xpath("//select/option[text()='Select Tool']"));
//        Select select = new Select(eleUIAutomationTool);
//        select.selectByVisibleText("Selenium");

        WebElement eleSelectCountry = driver.findElement(By.xpath("//label[text()='Select Country']"));
        Select select1 = new Select(eleSelectCountry);
        select1.selectByVisibleText("India");

        WebElement eleSelectCity = driver.findElement(By.xpath("//label[text()='Select City']"));
        Select select2 = new Select(eleSelectCity);
        select2.selectByVisibleText("Chennai");

        WebElement eleSelectLanguage = driver.findElement(By.xpath("//label[text()='Select Language']"));
        Select select3 = new Select(eleSelectLanguage);
        select3.selectByVisibleText("English");

        WebElement eleSelectValues = driver.findElement(By.xpath("//label[text()='Select Values']"));
        Select select4 = new Select(eleSelectValues);
        select4.selectByVisibleText("One");

        WebElement eleChooseCourse = driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
        Select select5 = new Select(eleChooseCourse);
        driver.findElement(By.xpath("//input[@placeholder='Choose Course']")).sendKeys("AWS");
        select5.selectByVisibleText("AWS");
        driver.close();
    }
}
