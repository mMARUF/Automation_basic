package marufrahman95atgmail.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class t {
public static void main(String args[]) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/selenium/guru99home/");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.close();
}
}