package JavaSE.BarrenMoore;

public class RiddleChest extends Feature {
	
	String riddle;
	boolean answerCorrect;

	public RiddleChest(String name, String type, String desc, String riddle, boolean answerCorrect, int location) {
		super(name, type, desc, location);
		this.riddle = riddle;
		this.answerCorrect = answerCorrect;
	}

	public String getRiddle() {
		return riddle;
	}

	public void setRiddle(String riddle) {
		this.riddle = riddle;
	}

	public boolean isAnswerCorrect() {
		return answerCorrect;
	}

	public void setAnswerCorrect(boolean answerCorrect) {
		this.answerCorrect = answerCorrect;
	}
	
//	
//	public String getType(String type) {
//		return type;
//	}
//	
//	p

}
