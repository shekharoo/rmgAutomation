package rmgAutomation.projectTest;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;


public class AddProjectDeserialization {

	public static void main(String[] args) throws Throwable {
		
		ObjectMapper mapper = new ObjectMapper();
		AddProjectPojoClass ap = mapper.readValue(new File("./resource/file.json"), AddProjectPojoClass.class);
		System.out.println(ap.projectName);
		System.out.println(ap.projectId);
        
        System.out.println(ap.createdBy);
        System.out.println(ap.createdOn);
        System.out.println(ap.status);
        System.out.println(ap.teamSize);
	}

}
