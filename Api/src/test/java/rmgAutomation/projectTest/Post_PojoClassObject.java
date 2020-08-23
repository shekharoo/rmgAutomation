package rmgAutomation.projectTest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
/**
 * 2nd way to post the request
 * @author SHEKHAR
 *
 */
public class Post_PojoClassObject {
	
	@Test
	public void createProjectTest()
	{
		AddProjectPojoClass ap = new AddProjectPojoClass();
		ap.setProjectName("Estuate35");
		ap.setCreatedBy("Shekhar35");
		ap.setCreatedOn("aug");
		ap.setStatus("Completed");
		ap.setTeamSize(10);
		
	ap = given()
		.contentType(ContentType.JSON)
		.body(ap)
		.log().all()
	.when()
		.post("http://localhost:8084/addProject").as(AddProjectPojoClass.class);
//	.then()
//		.log().all();
	
	System.out.println(ap.getProjectId());
	System.out.println(ap.getProjectName());
	System.out.println(ap.getCreatedOn());
	
	}


}
