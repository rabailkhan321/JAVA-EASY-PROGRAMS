public class Rectangle{
	double length;
	double width;
	double calculateArea(){
		double area=length*width;
		return area;
	}
	double calculatePerimeter(){
		double p=2*(length+width);
		return p;
	}
}