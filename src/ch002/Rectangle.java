package ch002;

public class Rectangle extends Shape{
     private double width;  //长方形的宽
     private double length; //长方形的长
 	 private final String name = "正方形";
     
     public Rectangle(double width, double length) {
    	       this.width = width;
    	       this.length = length;	 
     }

 	@Override
 	public double getArea() {
 		return width * length;
 	}
	public String toString(){
        return this.name;
    }



}
