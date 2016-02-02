package stefanini.matteo.harbour;

public abstract class Invasore {
	private int id;
	private String model;
	private int p;
	
	public abstract int power();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}
	
	
}
