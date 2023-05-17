package FinalUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FinalBase {
	public static WebDriver driver;
	public static Properties wpro;
	public FinalBase() {
		try {
			FileInputStream FinalProjectFile = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\FinalProjectconfig\\FinalProject.Properties");

			 wpro = new Properties ();
			 wpro.load(FinalProjectFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		System.out.println("Please check your code");
			e.printStackTrace();
		}
		
	}
public void FinalProjectBrowser() {
 String	Browser = wpro.getProperty("FinalProjectBrowser1");
 
 if(Browser.equalsIgnoreCase("Chrome")) {
	// System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+"\\Driver\\chromedriver.exe"));
	// driver = new ChromeDriver ();
	 System.setProperty("webdriver.Edge.driver",(System.getProperty("user.dir")+"\\ieDriver\\msedgedriver.exe"));
	  EdgeOptions co = new EdgeOptions();
	  co.addArguments("--remote-allow-origins=*");
	 driver = new EdgeDriver(co);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FinalTestData.implicitlyWait));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FinalTestData.pageLoadTimeout));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies(); 
 }
 else if  (Browser.equalsIgnoreCase("FF"));
 }
 
 public static void FinalProjectURL(String URL) {
	 driver.get(wpro.getProperty("URLQA"));
 }
}

