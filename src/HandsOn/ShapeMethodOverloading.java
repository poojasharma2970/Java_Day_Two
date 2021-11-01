package HandsOn;

public class ShapeMethodOverloading {

	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.perimeter(4,7);
		sh.area(2,5);
		sh.area(3);
		sh.perimeter(6);
	}

}

class Shape{
	float area;
	float perimeter;
	
	void area(float l, float b) {
		area = l*b;
		System.out.println("The Area of Rectangle : "+area);
	}
	
	void perimeter(float l, float b) {
		perimeter = 2 * (l+b);
		System.out.println("The perimeter of Rectangle :"+perimeter);
	}
	
	void area(float s) {
		area = s * s;
		System.out.println("The area of square :"+area);
	}
	
	void perimeter(float s) {
		perimeter = 4 *s;
		System.out.println("The perimeter of square :"+perimeter);
	}
}