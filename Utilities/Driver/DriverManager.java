package driver;

import driver.DriverClass;

public class DriverManager {

	private static ThreadLocal<DriverClass> driver = new ThreadLocal<DriverClass>();
	 
	//This will return the driver get object to the calling method
    public static DriverClass getDriver() {
        return driver.get();
    }// End of getDriver method
 
    // This will set the Thread safe This class driver object value with the recieved driver object value
    public static void setDriver(DriverClass drive) {
        driver.set(drive);
    }// End of set Driver method
}
