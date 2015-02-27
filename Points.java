import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Point {
	private int x,y;
	private String originalPosition;

	public Point(int x, int y) {
		originalPosition = "("+ x + "," + y +")";
		this.x = x;
		this.y = y;
	}

	public void moveBy(int byX, int byY) {
		x += byX;
		y += byY;
	}

	public String toString() {
		return "("+x+", " +y+")";
	}

	public int compareTo(Point other) {
		return (this.x+this.y) - (other.x + other.y); 
	}
}

class PointComparator implements Comparator<Point> {
	public int compare(Point left, Point right) {
		System.out.println("Comparing (left:" + left + ", right:" + right + ")");
		return left.compareTo(right);
	}

	public boolean equals(Object obj) {
		return false;
	}
}

class Program {
	public static void main(String[] args) {
		Point[] points = {
			new Point(1,2),
			new Point(2,2),
			new Point(2,1),
			new Point(0,0)
		};

		SortedSet<Point> setOfPoints = new TreeSet<Point>(new PointComparator()); 

		for(Point point: points) {
			setOfPoints.add(point);
		}


		for(Point point: setOfPoints) {
			System.out.println(point);
		}
	}
} 