package day3;

public class ShapeDemo {
	public static void main(String[] args) {
		Rectangle r = new Rectangle("red",2.5,4.5);
		r.showDetails();
		Circle c = new Circle("blue",3.5);
		c.showDetails();
		Triangle t = new Triangle("Green",10,20);
		t.showDetails();
	}

}
