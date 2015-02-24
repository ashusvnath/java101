abstract class Shape {
	public abstract int perimeter();

	public int area() {
		return 0;
	}
	
	public boolean fewerSidesThan(int n) {
		return true;
	}

	public String toString(){
		return "Shape";
	}
}

class Rectangle extends Shape {
	public static final String type = "Rectangle";
	public static final Rectangle r = new Rectangle(1,1);

	private int l,b;

	public Rectangle(int l,int b) {
		this.l = l;
		this.b = b;
	}

	public int perimeter() {
		return 2*(l+b);
	}

	public int area() {
		return l*b;
	}

	public boolean fewerSidesThan(int n) {
		return n>4;
	}

	public double diagonal() {
		return Math.sqrt(l*l + b*b);
	}

	public void magnify() {
		this.l *= 2;
		this.b *= 2;
	}

	public String toString(){
		return "Rectangle(Length:"+l+", Breadth:" +b+")";
	}


}

class Circle extends Shape {
	private int r;
	public Circle(int r) {
		this.r = r;
	}

	public int perimeter() {
		return 2*3*r;
	}
	public int area() {
		return 3*r*r;
	}

	public boolean fewerSidesThan(int n) {
		return false;
	}

	public String toString(){
		return "Cricle(Radius:"+ r +")";
	}
}

class Point extends Shape {
	public int perimeter() {
		return 0;
	} 

	public String toString() {
		return "Point";
	}
}

class Shapes {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,3);
		System.out.println(r + " " + r.area());
		r.magnify();
		Point p = new Point();
		
		System.out.println(Rectangle.r);
		
		Circle c=new Circle(2);

		Shape[] shapes = {r,c, p};

		for (Shape shape:shapes ) {
			System.out.println(shape + " " + shape.area());
		}
	}
}