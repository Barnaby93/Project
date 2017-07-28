package JavaSE.BarrenMoore;

public class Runner {

	public static void main(String[] args) {

		Navigate n = new Navigate();

		Player a = new Player(1, "Jack", "Middle of an infinite grey swamp");
		Player a1 = new Player(2, "Bradley", "Middle of an infinite grey swamp");
		Player a2 = new Player(3, "Pro", "Middle of an infinite grey swamp");
		Player a3 = new Player(4, "Pro", "Middle of an infinite grey swamp");

		a.addPlayer(a1);
		// System.out.println(a.getName());

		Feature f = new Feature(null, null, null, 0);

		TreasureChest t = new TreasureChest("Feature Chest!", "Treasure Chest!",
				"Well done, you've found the treasure chest and won!", "Gold", 1000, 4);
		f.addFeature(t);
		// System.out.println(t.getDesc());
		//
		RiddleChest r = new RiddleChest("Feature Chest!", "Riddle Chest! ",
				"Answering the riddle correct will lead you right to the Treasure Chest!", "put riddle here", true, 6);
		f.addFeature(r);
		// System.out.println(r.getDesc());
		//
		ClueChest c = new ClueChest("Feature Chest!", "Clue Chest! ",
				"Answering this clue will send you along your path quicker ", "put clue here ", true, 8);
		f.addFeature(c);
		// System.out.println(c.getDesc());
		//
		PowerUpChest p = new PowerUpChest("Feature Chest!", "Power Up Chest! ",
				"This chest gives you extra weapons & armour to be safer along your travels!", "new weapons here",
				"new armour here", 10);
		f.addFeature(p);
		// System.out.println(p.getDesc());

		System.out.println("Welcome to the adventure of the barren moor. Enter your name to start playing o0o0o0o0o0o: ");
		String nameInput = UserInput.sc.nextLine();
		System.out.println(
				nameInput + ", are you sure you're ready to explore the infinite, dreary greay swap of barren moor?(Yes/No)");
		String doYouWantToPlay = UserInput.sc.nextLine();

		if (doYouWantToPlay.equals("Yes") || doYouWantToPlay.equals("yes")) {
			n.Switch(p);
		}

	}

}
