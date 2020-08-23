package rmgAutomation.projectTest;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
/**Posting complex json file 
 * 5th way to post the request
 * but this is not a serialization way
 * @author SHEKHAR
 */
public class Post_UsingJsonFile {
	
	@Test
	public void createProjectTest() throws Throwable
	{
		FileInputStream fis = new FileInputStream(new File("./resource/file.json"));
		
		
	given()
		.contentType(ContentType.JSON)
		.body(IOUtils.toByteArray(fis))
		.log().all()
	.when()
		.post("http://localhost:8084/addProject")
	.then()
		.log().all();
	}


}
