import java.util.Scanner;
public class Accounttest{
	public static void main(String args[]){
		Account a=new Account();
		Scanner input= new Scanner(System.in);
		System.out.printf("your name is %s", a.getName());
		System.out.println("Please enter your name");
		String name= input.nextLine();
		a.setName(name);
		System.out.printf(" your name is %s",a.getName() );
	}
}
