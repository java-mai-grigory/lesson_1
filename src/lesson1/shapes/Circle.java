package lesson1.shapes;

public class Circle {
	private double x, y, R;

	public Circle(double x, double y, double r) {
		super();
		this.x = x;
		this.y = y;
		R = r;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}
	
	public double square()
	{
		return Math.PI * R * R;
	}
	
	public double length() 
	{
		return 2 * Math.PI * R;
	}
	
	
	public int compare(Circle other)
	{
		return (int)(this.square() - other.square());
	}
	
	public int compare(Circle first, Circle second)
	{
		return (int)(first.square() - second.square());
	}
	
}
