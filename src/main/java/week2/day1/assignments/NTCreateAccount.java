package week2.day1.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class NTCreateAccount {

    public static void main(String[] args) {
        //Pseudo Code
        // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //2. Enter UserName and Password Using Id Locator
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        //3. Click on Login Button using Class Locator
        driver.findElement(By.className("decorativeSubmit")).click();

        //4. Click on CRM/SFA Link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // 5. Click on Accounts Button
        driver.findElement(By.linkText("Accounts")).click();

        // 6. Click on Create Account
        driver.findElement(By.linkText("Create Account")).click();

        // 7. Select preferred currency as Indian Rupee using SelectByValue
        WebElement elePreferred = driver.findElement(By.xpath("//select[@name='currencyUomId']"));
        Select select = new Select(elePreferred);
        select.selectByValue("INR");

        // 8. Enter the Description text as "NRI Account"
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");

        // 9. Enter LocalName Field Using Xpath Locator
        driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Local");

        // 10. Enter SiteName Field Using Xpath Locator
        driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Site");

        // 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
        driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("1000000");

        // 12. Select Industry as ComputerSoftware
        WebElement eleIndustry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
        Select select1 = new Select(eleIndustry);
        select1.selectByVisibleText("Computer Software");

        // 13. Select OwnerShip as S-Corporation using SelectByVisibletext
        WebElement eleOwnership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
        Select select2 = new Select(eleOwnership);
        select2.selectByVisibleText("S-Corporation");

        // 14. Select Source as Employee using SelectByValue
        WebElement eleSource = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
        Select select3 = new Select(eleSource);
        select3.selectByValue("LEAD_EMPLOYEE");

        // 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
        WebElement eleMarketing = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
        Select select4 = new Select(eleMarketing);
        select4.selectByIndex(5);

        // 16. Select State/Province as Texas using SelectByValue
        WebElement eleState = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
        Select select5 = new Select(eleState);
        select5.selectByValue("TX");

        // 17. Click on Create Account using Xpath Locator
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // 18. Get the Text of Error Message Displayed (hint: Red Texts)
        WebElement errorHeader = driver.findElement(By.xpath("//div[@class='errorMessageHeader']"));
        WebElement errorMessage = driver.findElement(By.xpath("//li[@class='errorMessage']"));
        System.out.println(errorHeader.getText());
        System.out.println(errorMessage.getText());

    }

}
