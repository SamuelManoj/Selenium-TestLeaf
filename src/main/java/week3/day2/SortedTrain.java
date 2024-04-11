package week3.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedTrain {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("txtStationFrom")).clear();
        driver.findElement(By.id("txtStationFrom")).sendKeys("Mas", Keys.TAB);
        driver.findElement(By.id("txtStationTo")).clear();
        driver.findElement(By.id("txtStationTo")).sendKeys("SBC", Keys.TAB);

        WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
        List<WebElement> tableSize = table.findElements(By.tagName("tr"));
        int size = tableSize.size();

        System.out.println(size);

        int size1 = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[1]")).size();
        System.out.println(size1);

        List<WebElement> names1 = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[1]"));
        for (WebElement name : names1) {
            System.out.println(name.getText());
        }

//        driver.findElement(By.xpath("//a[contains(@title,'Click here to sort on Train Number')]")).click();

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        List<WebElement> names = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[1]"));
        for (WebElement name : names) {
            set1.add(name.getText());
            set2.add(name.getText());
            System.out.println(name.getText());
        }
        System.out.println("---------------------------------------------------------");

        if (set1.equals(set2)) {
            System.out.println("Train Sorting is working fine");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(set1);
        System.out.println(set2);
    }
}
