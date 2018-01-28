import java.util.Scanner;

public class check_contains_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String !");
		String a = sc.nextLine();
		System.out.println("Enter another String !");		
		String b = sc.nextLine();
		if(a.contains(b))         // Checking if String b is contained in String a
		{
			System.out.println("Yes , it is present at location "+a.indexOf(b));
		}
		else
		{
			System.out.println("No, the string is not present");
		}

	}

}
