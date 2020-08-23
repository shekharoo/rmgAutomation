package rmgAutomation.projectTest;

import java.io.Serializable;

public class SerializationExample implements Serializable{
	String name;
	int score;
	int level;
	int life;
	public SerializationExample(String name, int score, int level, int life) {
		super();
		this.name = name;
		this.score = score;
		this.level = level;
		this.life = life;
	}

}
