package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	
	double area;
	double perimeter;
	
	//Lascio in questa maniera

	
	public Statistics(double perimeter, double area){
		this.area = area;
		this.perimeter = perimeter;
	}
	
	public void add(Statistics stat){
		area += stat.area;
		perimeter += stat.perimeter;
	}
	
	
	public double getArea(){
		return area;
	}
	
	public double getPerimeter(){
		return perimeter;
	}

}
