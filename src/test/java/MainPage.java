
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainPage {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://compressjpeg.com/ru");
    }

    @Test
    public void signInTest() {

        By fileInput = By.cssSelector("input[type=file]");
        String filePath = "C:\\Users\\Квист\\Desktop\\compressjpeg\\image\\1.jpg";
        String filePath2 = "C:\\Users\\Квист\\Desktop\\compressjpeg\\image\\2.jpg";
        String filePath3 = "C:\\Users\\Квист\\Desktop\\compressjpeg\\image\\3.jpg";
        String filePath4 = "C:\\Users\\Квист\\Desktop\\compressjpeg\\image\\4.jpg";
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(fileInput).sendKeys(filePath2);
        driver.findElement(fileInput).sendKeys(filePath3);
        driver.findElement(fileInput).sendKeys(filePath4);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
