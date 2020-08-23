package rmgAutomation.projectTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class DeleteSpecificProject {
	@Test
	public void getAllProjects()
	{
		given()
		.when()
		.and()
		.delete("http://localhost:8084/projects/TY_PROJ_003")
		.then()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON)
		.and()
		.log().all();
		//.then().log().all();
	}

}
