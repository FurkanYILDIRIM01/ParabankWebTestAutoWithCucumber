package Base;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;


public class BaseTest extends BaseLib{

    public WebDriver driver;
    @Before
    public void setUp() {
        String Browser= System.getProperty("browser");
        String osName= System.getProperty("os.name");
        if (Browser==null) {Browser="Firefox";}

        System.out.println(osName);
        System.out.println(Browser);

        if (Browser.equals("Chrome")) {
            if (osName.equals("Windows 10")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

            } else {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            }
            driver = new ChromeDriver();
        }else {
            if (osName.equals("Windows 10")) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

            } else {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
            }
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com");
        }

    }
    @Given("Browser Open URL")
    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com");
        HomePage.setDriver(driver);
    }
    @AfterMethod
    public void after(){
        driver.quit();

    }
}
