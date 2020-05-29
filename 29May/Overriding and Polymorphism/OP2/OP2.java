package wipro;
import wipro.Shape;
import wipro.Triangle;
import wipro.Circle;
import wipro.Square;
public class OP2 {
	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
	}
}