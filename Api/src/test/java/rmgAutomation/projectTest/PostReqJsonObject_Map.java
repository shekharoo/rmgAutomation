package rmgAutomation.projectTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


/**
 * 1st way to post the request
 * @author SHEKHAR
 *
 */
public class PostReqJsonObject_Map {
	
	@Test
	public void createProjectTest()
	{
		JSONObject jsObject = new JSONObject();
		jsObject.put("projectName", "Estuate1");
		jsObject.put("createdBy", "ShekuAnand1");
		jsObject.put("createdOn", "aug");
		jsObject.put("status", "Completed");
		
	given()
		.contentType(ContentType.JSON)
		.body(jsObject.toJSONString())
		.log().all()
	.when()
		.post("http://localhost:8084/addProject")
	.then()
		.log().all();
	}

}
