package rmgAutomation.projectTest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
/**
 * 4th way to post the request
 * @author SHEKHAR
 *
 */
public class Post_ExplicitSerializer {
	
	@Test
	public void createProjectTest()
	{
		AddProjectPojoClass ap = new AddProjectPojoClass();
		ap.setProjectName("Estuate17");
		ap.setCreatedBy("Shekhar17");
		ap.setCreatedOn("aug");
		ap.setStatus("Completed");
		ap.setTeamSize(10);
		
	given()
		.contentType(ContentType.JSON)
		.body(ap,ObjectMapperType.JACKSON_1)
	.when().log().all()
		.post("http://localhost:8084/addProject")
	.then()
		.log().all();
	}


}
