package rmgAutomation.projectTest;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.codehaus.jackson.map.ObjectMapper;
public class AddprojectSerializationTest {

	public static void main(String[] args) throws Throwable {
		//AddProjectPojoClass ap = new AddProjectPojoClass("TY-0015", "IBM", "Shekhar", "aug", "Completed", 10);
		AddProjectPojoClass ap = new AddProjectPojoClass();
		ObjectMapper mapper = new ObjectMapper();
		ap.setProjectId("Ty-0015");
		ap.setProjectName("Estuate");
		ap.setCreatedBy("Shekhar");
		ap.setCreatedOn("aug");
		ap.setStatus("Completed");
		ap.setTeamSize(10);
		mapper.writeValue(new File("./resource/file.json"), ap);
		System.out.println("Done!!");

	}

}
