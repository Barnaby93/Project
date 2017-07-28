package JavaSE.BarrenMoore;

public class Timer {
	
	long startTime;
	long endTime;
	
	public void startTime() {
		startTime = System.currentTimeMillis();
	}
	
	public void endTime() {
		endTime = System.currentTimeMillis();
	}
	
	public void timeTaken() {
		System.out.println("Total execution time: " + ((double) (endTime - startTime) / 1000) + " seconds");
	}
	
	

}
