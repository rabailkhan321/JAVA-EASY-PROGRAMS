public class Dimension{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.length=3;
		r.width=4;
		double a = r.calculateArea();
		double per = r.calculatePerimeter();
		
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
	}
}
