package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://facebook.com");
//        driver.findElement(By.id("email")).sendKeys("bhargavak37@gmail.com");
//        driver.findElement(By.name("pass")).sendKeys("Datastructures!234");
//        driver.findElement(By.linkText("Forgotten account?")).click();
//        driver.findElement(By.cssSelector("#u_0_3")).click();
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhargavak37@gmail.com");
    }
}
