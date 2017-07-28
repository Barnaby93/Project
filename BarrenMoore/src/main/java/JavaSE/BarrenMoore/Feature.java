package JavaSE.BarrenMoore;

import java.util.ArrayList;

public class Feature {
	
	private String name;
	private String type;
	private String desc;
	private int location;
	
	private ArrayList<Feature> feature;
	
	public Feature(String name, String type, String desc, int location) {
		super();
		this.name = name;
		this.type = type;
		this.desc = desc;
		
		feature = new ArrayList<Feature>();
	}
	
	public int getLocation() {
		return location;
	}
	
	public ArrayList<Feature> getFeatures() {
		return feature;
	 }
	
	public void addFeature(Feature f) {
		feature.add(f);
	}

	public String getName() {
		return name;
	}	

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
