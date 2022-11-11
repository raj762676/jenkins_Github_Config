package jenkins_Github_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GIVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "B:\\my data\\New folder\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://give.do/");
	}

}
