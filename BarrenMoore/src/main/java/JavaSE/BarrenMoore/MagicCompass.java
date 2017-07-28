package JavaSE.BarrenMoore;

public class MagicCompass {
	Navigate n = new Navigate();
		
	public int startLocation() {
		int startLocation =0; 
		return startLocation;
	}
	
	public void newLocation() {
		int newLocation = (int) startLocation() + (int) n.distanceTravelled();
	}
	
	public void featureLocation(Feature f) {
		
		int featureLocation = f.getLocation();
	}
	
	public void distangeFromClosestFeature() {
		//nearest feature = Feature.closestTo.newlocation
	}
	

}
