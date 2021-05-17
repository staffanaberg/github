package common;

public class Point extends Shape {

	public Point(int x, int y) {
		super(x, y);
	}

	
	public void draw() {
		System.out.println("Drawing a point at:(" + getX() + ", " + getY() + ")");
	}
}
