import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String !");
		 String a = sc.nextLine();
         StringBuffer s = new StringBuffer(a);     
         System.out.println("The Reverse of the String is : "+s.reverse());
	}
}
