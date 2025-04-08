package arraywithhconstr;

public class Rectangle extends Shape{
	
	private int length;
	
	private int width;
	
	public Rectangle( ) {
		
	}
	
	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() { // OVERRIDE AREA METHOD OF SHAPE CLASS
		
		int rArea = length * width;
		System.out.println("Rectangle Area: " + rArea);
	}
}
