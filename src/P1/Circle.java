package P1;

public class Circle {
	private static double radius;
	
	public void setRadius(double inputRadius) {
		radius = inputRadius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCirc() {
		return 2 * Math.PI * radius;
	}

}
