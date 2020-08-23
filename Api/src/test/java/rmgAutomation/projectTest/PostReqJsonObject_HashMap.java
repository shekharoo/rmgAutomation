package rmgAutomation.projectTest;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;


/**
 * 3rd way to post the request
 * @author SHEKHAR
 *
 */
public class PostReqJsonObject_HashMap {
	
	@Test
	public void createProjectTest()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("projectName", "Estuate4");
		map.put("createdBy", "ShekuAnand2");
		map.put("createdOn", "aug");
		map.put("status", "Completed");
		
	given()
		.contentType(ContentType.JSON)
		.body(map)
		.log().all()
	.when()
		.post("http://localhost:8084/addProject")
	.then()
		.log().all();
	}

}
