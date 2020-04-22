
public class Circle {

	// 1. private fields
	// 2. public default con, arg cons
	// 3. public getters and setters
	// 4. toString
	// 5. TestCircle

	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {

		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

}
