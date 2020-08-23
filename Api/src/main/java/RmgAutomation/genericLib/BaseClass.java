package RmgAutomation.genericLib;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;


public class BaseClass {
	/**
	 * 
	 * @throws Throwable
	 */
	@BeforeSuite
	public void beforeClassConfig() throws Throwable
	{
		baseURI = "http://localhost:8084";
		port = 8084;
		DatabaseLib.establishConn(Iconstant.URL, Iconstant.USERNAME, Iconstant.PSSWD);
	}
		/**
		 * 
		 * @throws Throwable
		 */
		@AfterSuite
		public void afterClassConfig() throws Throwable 
		{
			DatabaseLib.closeConn();
		}
	}

