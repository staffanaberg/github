package common;

public class Rectangle extends Shape {
	private int width;
	private int height;

	// constructor
	Rectangle(int x, int y, int newwidth, int newheight) {
		super(x, y);
		setWidth(newwidth);
		setHeight(newheight);
	}

	// accessors for the width & height
	int getWidth() {
		return width;
	}

	int getHeight() {
		return height;
	}

	void setWidth(int width) {
		this.width = width;
	}

	void setHeight(int height) {
		this.height = height;
	}

	// draw the rectangle
	void draw() {
		System.out.println("Drawing a Rectangle at:(" + getX() + ", " + getY() + "), width " + getWidth() + ", height "
				+ getHeight());
	}
}
