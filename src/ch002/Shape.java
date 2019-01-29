package ch002;

public abstract class Shape implements Comparable<Shape>{
        public abstract double getArea();

        public int compareTo(Shape shape) {
			return Double.compare(this.getArea(), shape.getArea());
		}
 
}
