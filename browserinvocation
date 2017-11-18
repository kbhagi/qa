package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Ramanuja on 11/1/2017.
 */
public class browserinvocation {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Projects\\Auto\\geckodriver.exe");
//  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://qaclickacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
