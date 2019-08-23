package Driver;

import Driver.DriverClass;

public class DriverFactory {

	// This method will create the instance of the DirverClass 
		public static DriverClass createInstance( ) 
		{
	        DriverClass driver = new DriverClass();
	        return driver;
	    }// End of Create Instance
		
}
