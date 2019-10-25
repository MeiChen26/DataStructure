package ch002.FindMax;

public class Square extends Shape{
	private double edge;  //正方形的边长
	private final String name = "正方形";
	
	public Square(double edge) {
		this.edge = edge;
	}
	
	@Override
	public double getArea() {
		return edge * edge;
	}
	
	//System.out.print(shape)时打印toString该写的内容
	public String toString(){
        return this.name;
    }

}
