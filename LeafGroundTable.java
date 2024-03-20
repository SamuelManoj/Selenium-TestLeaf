package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LeafGroundTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
        driver.findElement(By.xpath("//a/i[@class='pi pi-fw pi-table layout-menuitem-icon']")).click();

        List<WebElement> names = driver.findElements(By.xpath("//table/thead[@class='ui-datatable-scrollable-theadclone']/following::tbody//td[1]"));
        System.out.println("Names *****************");
        for(WebElement name:names){
            System.out.println(name.getText());
        }

        List<WebElement> countries = driver.findElements(By.xpath("//table/thead[@class='ui-datatable-scrollable-theadclone']/following::tbody//td[2]"));
        System.out.println("Countries *****************");
        for(WebElement country:countries){
            System.out.println(country.getText());
        }

        List<WebElement> representatives = driver.findElements(By.xpath("//table/thead[@class='ui-datatable-scrollable-theadclone']/following::tbody//td[3]"));
        System.out.println("Representatives *****************");
        for(WebElement representative:representatives){
            System.out.println(representative.getText());
        }

        List<WebElement> join_dates = driver.findElements(By.xpath("//table/thead[@class='ui-datatable-scrollable-theadclone']/following::tbody//td[4]"));
        System.out.println("Join Dates *****************");
        for(WebElement join:join_dates){
            System.out.println(join.getText());
        }

        List<WebElement> status = driver.findElements(By.xpath("//table/thead[@class='ui-datatable-scrollable-theadclone']/following::tbody//td[5]"));
        System.out.println("Status *****************");
        for(WebElement state:status){
            System.out.println(state.getText());
        }
    }
}
