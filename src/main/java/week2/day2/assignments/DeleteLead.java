package week2.day2.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DeleteLead {
    public static void main(String[] args) {

        //		http://leaftaps.com/opentaps/control/main

//		Delete Lead:
//		1	Launch the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

//		2	Enter the username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");

//		3	Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

//		4	Click Login
        driver.findElement(By.className("decorativeSubmit")).click();

//		5	Click crm/sfa link
        driver.findElement(By.linkText("CRM/SFA")).click();

//		6	Click Leads link
        driver.findElement(By.linkText("Leads")).click();

//		7	Click Find leads
        driver.findElement(By.linkText("Find Leads")).click();

//		8	Click on Phone
        driver.findElement(By.linkText("Find Leads")).click();

//		9	Enter phone number
//		10	Click find leads button
//		11	Capture lead ID of First Resulting lead
//		12	Click First Resulting lead
//		13	Click Delete
//		14	Click Find leads
//		15	Enter captured lead ID
//		16	Click find leads button
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//		18	Close the browser (Do not log out)
    }

}