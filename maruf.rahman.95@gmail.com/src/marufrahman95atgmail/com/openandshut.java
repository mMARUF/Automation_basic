package marufrahman95atgmail.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;//if you want to automate with Firefox, then use this line and comment the chromedriver line

public class openandshut //opens a website in the browser and then closes the tab
{
 public static void main(String args[]) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");//use the location of your pc where the chromedriver can be found
	WebDriver driver = new ChromeDriver();
	
	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");//specifying FirefoxDriver and specify the path in which it is located
	//WebDriver driver = new FirefoxDriver();//Instantiate the webdriver to the new Firefoxdriver
	
	driver.get("http://google.com/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.getTitle();
	System.out.println(driver.getTitle());
	driver.close();//to close one tab of the browser
	//driver.quit();// to close the browser window
   }
}