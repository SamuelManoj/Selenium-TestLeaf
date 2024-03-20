package week2.day1.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateLead {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.linkText("Create Lead")).click();

        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("name");

        WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select select = new Select(eleSource);
        select.selectByVisibleText("Employee");

        WebElement eleMarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select select1 = new Select(eleMarketingCampaign);
        select1.selectByVisibleText("Automobile");

        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("firstname");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("lastname");
        driver.findElement(By.name("personalTitle")).sendKeys("Salutation");
        driver.findElement(By.name("birthDate")).sendKeys("03/7/23");
        driver.findElement(By.name("generalProfTitle")).sendKeys("Title");
        driver.findElement(By.name("annualRevenue")).sendKeys("12345");

        WebElement eleIndustry = driver.findElement(By.name("industryEnumId"));
        Select select2 = new Select(eleIndustry);
        select2.selectByVisibleText("Finance");

        WebElement eleOwnership = driver.findElement(By.name("ownershipEnumId"));
        Select select3 = new Select(eleOwnership);
        select3.selectByVisibleText("Corporation");

        driver.findElement(By.name("sicCode")).sendKeys("12345");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("test description");
        driver.findElement(By.name("importantNote")).sendKeys("important notes");

        driver.findElement(By.name("departmentName")).sendKeys("department name");

        WebElement elePreferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
        Select select4 = new Select(elePreferredCurrency);
        select4.selectByVisibleText("USD - American Dollar");

        driver.findElement(By.name("numberEmployees")).sendKeys("10000");
        driver.findElement(By.name("tickerSymbol")).sendKeys("10");

        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600100");
        driver.findElement(By.name("primaryPhoneExtension")).sendKeys("123");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");

        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
        driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("test");
        driver.findElement(By.name("primaryWebUrl")).sendKeys("www.test.com");

        driver.findElement(By.name("generalToName")).sendKeys("name");
        driver.findElement(By.name("generalAttnName")).sendKeys("name");
        driver.findElement(By.name("generalAddress1")).sendKeys("123, address");
        driver.findElement(By.name("generalAddress2")).sendKeys("123, address");
        driver.findElement(By.name("generalCity")).sendKeys("Chennai");

        WebElement eleStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select select5 = new Select(eleStateProvince);
        select5.selectByVisibleText("California");

        driver.findElement(By.name("generalPostalCode")).sendKeys("53001");

        WebElement eleCountry = driver.findElement(By.name("generalCountryGeoId"));
        Select select6 = new Select(eleCountry);
        select6.selectByValue("USA");

        driver.findElement(By.name("generalPostalCodeExt")).sendKeys("53001");
        driver.findElement(By.name("submitButton")).click();

    }
}
