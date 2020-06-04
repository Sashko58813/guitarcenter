import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public String title() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebAutoamtion\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        String title = chromeDriver.getTitle();
        chromeDriver.quit();
        return title;
    }






}
