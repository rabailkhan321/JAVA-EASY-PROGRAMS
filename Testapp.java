public class Testapp{
	
	public static void main(String args[]){
		
		Person p1=new Person();
		p1.id=1;
		p1.name="Rabail";
		p1.age=18;
		
		
	printData(p1);
	}
	public static void printData(Person p)
	{
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
	}
}
		