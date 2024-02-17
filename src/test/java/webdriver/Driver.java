package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Driver {

    private static WebDriver driver = null;

    private static Browsers BROWSER = Browsers.CHROME;

    private enum Browsers {CHROME}

    public static WebDriver getDriver() {

        if (driver == null) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void setDriver(WebDriver dri) {
        driver = dri;
    }
}
