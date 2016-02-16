package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class EquilateralTriangle extends Shape {
	
	private double base;
	private double height;
	
	@Override
	public double area(){
		return base*height/2;
	}
	
	@Override
	public double perimeter(){
		return base * 3;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double width) {
		this.base = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double d) {
		this.height = d;
	}
	
}
