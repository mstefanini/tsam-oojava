package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	
	private Shape shapes[];
	
	public double totalArea(){
		double total = 0;
		for(Shape s: shapes){
			total += s.area();
		}
		return total;
	}
	
	public double totalPerimeter(){
		double total = 0;
		for(Shape s: shapes){
			total += s.perimeter();
		}
		return total;
	}

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	
}
