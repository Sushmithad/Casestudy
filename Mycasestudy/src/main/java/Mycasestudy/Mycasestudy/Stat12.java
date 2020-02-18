package Mycasestudy.Mycasestudy;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	public class Stat12 {
		
			public static WebDriver gdriver(String name) {
				if(name.equals("Ch")) {
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
			    return new ChromeDriver();
				}
				else if(name.equals("ie"))
				{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
				 return new InternetExplorerDriver();
				}
				else
				{
				return null;
			}

		}

	}

