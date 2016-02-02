package stefanini.matteo.harbour;

public class PortoNavale {
	
	private String name;
	private int watercrafts;
	private int area;
	
	public void getDamage(int damage){
		area -= damage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWatercrafts() {
		return watercrafts;
	}
	public void setWatercrafts(int watercrafts) {
		this.watercrafts = watercrafts;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
}
