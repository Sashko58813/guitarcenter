import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

    public String title() {
        System.setProperty("webdriver.opera.driver", "D:\\WebAutoamtion\\WebDrivers\\Opera\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        WebDriver operaDriver = new OperaDriver();
        operaDriver.get("https://www.google.com/");
        String title = operaDriver.getTitle();
        operaDriver.quit();
        return title;

    }
}
