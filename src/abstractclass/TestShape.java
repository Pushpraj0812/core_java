package abstractclass;

public class TestShape {
	
	public static void main(String[] args) {

		Shape[] shape = new Shape[2];

		shape[0] = new Rectangle();

		shape[1] = new Circle();

		Rectangle r = (Rectangle) shape[0];
		r.setLength(10);
		r.setWidth(20);

		Circle c = (Circle) shape[1];
		c.setRadius(10);
		
		for (int i = 0; i < shape.length; i++) {
			shape[i].area();
		}
	}
}