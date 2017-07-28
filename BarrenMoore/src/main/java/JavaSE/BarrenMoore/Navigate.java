package JavaSE.BarrenMoore;

public class Navigate {

	public void Switch(Feature f) {

		while (f.getClass().getSimpleName().equals("TreasureChest") == false) {

			System.out.println("Which Direction do you wish to travel in? (North/South/West/East)");
			String whatTheyInput = UserInput.sc.nextLine();

			switch (whatTheyInput) {

			case "North":
				System.out.println("You have travelled" + distanceTravelled() + " North, your new position is"
						+ " MagicCompass says (new position)" + " you are now" + " distanceFromClosestFeature"
						+ " Away from the closest feature");
				break;
			case "South":
				System.out.println("You have travelled" + distanceTravelled()  + " South, your new position is"
						+ " MagicCompass says (new position)" + " you are now" + " distanceFromClosestFeature"
						+ " Away from the closest feature");
				break;
			case "East":
				System.out.println("You have travelled" + distanceTravelled()  + " your new position is"
						+ " MagicCompass says (new position)" + " you are now" + " distanceFromClosestFeature"
						+ " Away from the closest feature");
				break;
			case "West":
				System.out.println(" You have travelled (random number between 1-2 miles West)" + " your new position is"
						+ " MagicCompass says (new position)" + " you are now" + " distanceFromClosestFeature"
						+ " Away from the closest feature");
				break;
			}
		}

	}


	public double distanceTravelled() {
		double min = Math.ceil(1);
		double max = Math.floor(5);
		double distanceTravelled = Math.random();
		distanceTravelled = Math.round(distanceTravelled);
		return distanceTravelled;
	}
}
