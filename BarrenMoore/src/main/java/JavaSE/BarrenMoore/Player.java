package JavaSE.BarrenMoore;

import java.util.ArrayList;

public class Player {

	private ArrayList<Player> player;

	int id;
	String name;
	String location;

	public Player(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		
		player  = new ArrayList<Player>();
		}
	
	public ArrayList<Player> getPlayers() {
		return player;
	 }
	
	public void addPlayer(Player a) {
		player.add(a);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
