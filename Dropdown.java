package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ramanuja on 11/18/2017.
 */
public class Dropdown {
   static   WebDriver driver;
    WebDriverWait wait;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver", "D:\\Projects\\Auto\\chromdriver.exe");
         driver = new ChromeDriver();
        driver.get("http://www.spicejet.com");
        driver.manage().window().maximize();

       Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
       Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
       Select  s2= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("(//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a)[2]")).click();
    }
}
