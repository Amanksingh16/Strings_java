import java.util.Scanner;

public class Substrings_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String !");
		String a = sc.nextLine();
		String b = new String();
		for(int i=0; i<a.length() ; i++)
		{
			for(int j=i+1; j<=a.length(); j++)
			{
				b = a.substring(i,j);	
				System.out.print(b+" ");				
			}
			
		}
        
	}

}
