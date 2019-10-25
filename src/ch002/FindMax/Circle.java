package ch002.FindMax;

public class Circle extends Shape{
	private double radius;  //实例变量 圆的半径
	private final String name = "圆";
	
	//有参构造方法
	public Circle(double radius) {
		this.radius = radius;		
	}
	
	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public String toString(){
	        return this.name;
	    }


}
