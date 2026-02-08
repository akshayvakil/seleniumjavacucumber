package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

/**
 * BaseClass consolidates reusable utilities:
 * - DriverManager: handles browser lifecycle
 * - ConfigReader: externalizes configs (URL, credentials)
 * - WaitUtils: reusable explicit waits
 *
 * ✅ Interview Note:
 * In industry, we centralize these utilities in a base class to avoid duplication.
 * This shows modular design and scalability.
 */
public class BaseClass {
    protected static WebDriver driver;
    private static Properties properties;

    // Load config once at class load
    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
        	System.out.println("File Not Found Exception observed");
            e.printStackTrace();
        }
    }

    // Config reader utility
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    // Driver manager utility
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); // auto-manages driver binaries
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // Wait utility
    public static void waitForElement(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
