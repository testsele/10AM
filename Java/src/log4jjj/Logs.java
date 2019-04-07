package log4jjj;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {
	
	public static Logger l=Logger.getLogger(Logs.class);

	public static void main(String[] args) throws Exception{
		
		// Configuring properties file during runtime
		//PropertyConfigurator.configure("‪‪C:\\Users\\DELL\\Desktop\\JavaProject\\log4j.properties");
		PropertyConfigurator.configure("C:\\Users\\DELL\\Desktop\\JavaProject\\log4j.properties");
		int a=20; int b=30;
		if(a<b)
			l.info("Pass");
		else
			l.error("Fail");

	}

}
