package week2.day1.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateAccount {
    public static void main(String[] args) {
        //Pseudo Code

//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		2. Enter UserName and Password Using Id Locator
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

//		3. Click on Login Button using Class Locator
        driver.findElement(By.className("decorativeSubmit")).click();

//		4. Click on CRM/SFA Link
        driver.findElement(By.linkText("CRM/SFA")).click();

//		5. Click on Accounts Button
        driver.findElement(By.linkText("Accounts")).click();

//		6. Click on Create Account
        driver.findElement(By.linkText("Create Account")).click();

//		7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited");

//		8. Enter Description as "Selenium Automation Tester"
        driver.findElement(By.xpath("//textarea[@name='description']")).
                sendKeys("Selenium Automation Tester");

//		9. Enter LocalName Field Using Xpath Locator
        driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Local Name");

//		 10. Enter SiteName Field Using Xpath Locator
        driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Site Name");

//		 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
        driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("12345");

//		 12. Select Industry as ComputerSoftware
        WebElement eleIndustry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
        Select select = new Select(eleIndustry);
        select.selectByIndex(0);

//		 13. Select OwnerShip as S-Corporation using SelectByVisibletext
        WebElement eleOwnerShip = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
        Select select1 = new Select(eleOwnerShip);
        select1.selectByVisibleText("S-Corporation");

//		 14. Select Source as Employee using SelectByValue
        WebElement eleSource = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
        Select select2 = new Select(eleSource);
        select2.selectByValue("LEAD_EMPLOYEE");

//		 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
        WebElement eleMarketingCampaign = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
        Select select3 = new Select(eleMarketingCampaign);
        select3.selectByIndex(5);

//		 16. Select State/Province as Texas using SelectByValue
        WebElement eleState = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
        Select select4 = new Select(eleState);
        select4.selectByValue("TX");

//		 17. Click on Create Account using Xpath Locator
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
