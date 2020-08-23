package rmgAutomation.projectTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws Throwable {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("./backUp.ser"));
		SerializationExample s = (SerializationExample)in.readObject();
		System.out.println(s.name);
		System.out.println(s.score);
		System.out.println(s.level);
		System.out.println(s.life);
		in.close();

	}

}
