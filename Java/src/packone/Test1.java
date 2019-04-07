package packone;

import org.openqa.selenium.By;

public class Test1 {

	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.launchApp("http://bharatmatrimony.com");
		m.elementPresent("NAME", true);		
		m.closeApp();
		m.launchApp("http://facebook.com");
		m.elementPresent("email", true);
		m.elementPresent("pass", false);
		m.elementPresent("day", false);
		m.driver.findElement(By.id("email")).sendKeys("ghfhgg");
		m.closeApp();

	}

}
