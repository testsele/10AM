package gridd;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Browserstack {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("os", "WINDOWS");
		d.setCapability("os_version", "XP");
		d.setCapability("browser", "Firefox");
		d.setCapability("browser_version", "33");
		d.setCapability("browserstack.debug", true);
		
		
		URL u=new URL("https://naveen487:kL1DApVsqvsJsptA5Sgb@hub-cloud.browserstack.com/wd/hub");
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		
		WebDriver driver=r;
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		

	}

}
