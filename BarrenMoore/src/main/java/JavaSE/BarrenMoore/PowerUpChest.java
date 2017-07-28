package JavaSE.BarrenMoore;

public class PowerUpChest extends Feature {
	
	String newWeapons;
	String newArmour;
	
	public PowerUpChest(String name, String type, String desc, String newWeapons, String newArmour, int location) {
		super(name, type, desc, location);
		this.newWeapons = newWeapons;
		this.newArmour = newArmour;
	}

	public String getNewWeapons() {
		return newWeapons;
	}

	public void setNewWeapons(String newWeapons) {
		this.newWeapons = newWeapons;
	}

	public String getNewArmour() {
		return newArmour;
	}

	public void setNewArmour(String newArmour) {
		this.newArmour = newArmour;
	}


}
