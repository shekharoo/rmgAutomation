package RmgAutomation.genericLib;

import io.restassured.response.Response;
/**
 * 
 * @author SHEKHAR
 *
 */
public class JsonUtils {
	/**
	 * It returns the response based on json path provided
	 * @param resp
	 * @param path
	 * @return
	 */
	public Object getrepsonse(Response resp, String path)
	{
		return resp.jsonPath().get(path);
	}

}
