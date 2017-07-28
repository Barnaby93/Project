package JavaSE.BarrenMoore;

public class TreasureChest extends Feature {
	
	String treasure;
	int amount;

	public TreasureChest(String name, String type, String desc, String treasure, int amount, int location) {
		super(name, type, desc, location);
		this.treasure = treasure;
		this.amount = amount;
	}

	public String getTreasure() {
		return treasure;
	}

	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	

}
