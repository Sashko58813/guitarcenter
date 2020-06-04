import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public String title() {
        System.setProperty("webdriver.gecko.driver", "D:\\WebAutoamtion\\WebDrivers\\FireFox\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com/");
        String title = firefoxDriver.getTitle();
        firefoxDriver.quit();
        return title;
    }
}
