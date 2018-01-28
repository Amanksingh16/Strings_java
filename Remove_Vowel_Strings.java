import java.util.Scanner;

public class Remove_Vowel_Strings {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String !");
		String a = sc.nextLine();
		StringBuffer s = new StringBuffer(a);
		for(int i=0; i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{
				s.deleteCharAt(i);
			}
		}
		System.out.println("The String after removing vowels : "+s);
	}

}
