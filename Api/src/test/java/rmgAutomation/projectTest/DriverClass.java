package rmgAutomation.projectTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DriverClass {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SerializationExample se = new SerializationExample("Anand", 50000, 18, 25);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./backUp.ser"));
		out.writeObject(se);
		System.out.println("Done Serialization successfully!!");
		out.close();

	}

}
