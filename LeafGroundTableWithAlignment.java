package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LeafGroundTableWithAlignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
        driver.findElement(By.xpath("//a/i[@class='pi pi-fw pi-table layout-menuitem-icon']")).click();

        List<WebElement> names = driver.findElements(By.xpath("//table/thead[@class='ui-datatable-" +
                "scrollable-theadclone']/following::tbody//td[1]"));
        List<WebElement> countries = driver.findElements(By.xpath("//table/thead[@class='ui-datatable-" +
                "scrollable-theadclone']/following::tbody//td[2]"));
        List<WebElement> representatives = driver.findElements(By.xpath("//table/thead[@class='ui-" +
                "datatable-scrollable-theadclone']/following::tbody//td[3]"));
        List<WebElement> join_dates = driver.findElements(By.xpath("//table/thead[@class='ui-" +
                "datatable-scrollable-theadclone']/following::tbody//td[4]"));
        List<WebElement> status = driver.findElements(By.xpath("//table/thead[@class='ui-" +
                "datatable-scrollable-theadclone']/following::tbody//td[5]"));

        System.out.println("Names | Countries | Representatives | Join Dates | Status");
        System.out.println("*****************  | *****************  | *****************  | *****************  | " +
                "***************** ");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).getText() + " | " + countries.get(i).getText() + " | " +
                    representatives.get(i).getText() + " | " + join_dates.get(i).getText() + " | " +
                    status.get(i).getText());
        }
    }
}
