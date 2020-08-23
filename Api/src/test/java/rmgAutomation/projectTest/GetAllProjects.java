package rmgAutomation.projectTest;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetAllProjects {
	@Test
	public void getAllProjects()
	{
		Response res = given()
		.when()
		.and()
		.get("http://localhost:8084/projects");
		System.out.println(res.getStatusCode());
		res.prettyPrint();
		res.then()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON)
		.and()
		.log().all()
		//.then().log().all();
		.and()
		.assertThat().body("[0].projectId", equalTo("TY_PROJ_001"))
		.assertThat().body("[0].projectId", is("TY_PROJ_001"))
		.assertThat().body("[0].projectId", containsString("TY"))
		.assertThat().body("projectName", hasItems("Lorax","Zoho"));
	}

}
