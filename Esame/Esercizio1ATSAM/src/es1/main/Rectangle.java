package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Rectangle extends Shape{
	
	private double width;
	private double height;
	
	@Override
	public double area(){
		return width*height;
	}
	
	@Override
	public double perimeter(){
		return (width * 2) + (height * 2);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double d) {
		this.width = d;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
