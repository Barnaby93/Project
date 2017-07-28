package JavaSE.BarrenMoore;

public class ClueChest extends Feature {
	
	String clue;
	boolean answerCorrect;

	public ClueChest(String name, String type, String desc, String clue, boolean answerCorrect, int location) {
		super(name, type, desc, location);
		this.clue = clue;
		this.answerCorrect = answerCorrect;
	}

	public String getClue() {
		return clue;
	}

	public void setClue(String clue) {
		this.clue = clue;
	}

	public boolean isAnswerCorrect() {
		return answerCorrect;
	}

	public void setAnswerCorrect(boolean answerCorrect) {
		this.answerCorrect = answerCorrect;
	}

}
