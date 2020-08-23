package rmgAutomation.projectTest;

import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class ResponsePropertyTransfer {
	@Test
	public void getAllProjects()
	{
		Response res = given()
		.when()
		.and()
		.get("http://localhost:8084/projects");
		System.out.println(res.getStatusCode());
		//res.prettyPrint();
		
		/*******Extract the response************/
		List<Object> lst = res.jsonPath().get("projectId");
		//System.out.println(lst);
		
		
		/********Request Chaining*************/
		for(int i=0; i<lst.size();i++)
		{
			String projectId = (String)lst.get(i);
			System.out.println(projectId);
			given()
			.pathParam("pId", projectId)
			.when()
		      .get("http://localhost:8084/projects/{pId}")
		      .then().log().all()
		      .assertThat().statusCode(200)
		      .and()
		      .body("projectId", equalTo(projectId));
			
		}
	
		
	}

}
