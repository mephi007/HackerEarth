import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter string");
		String str= in.next();
		
		
		int y = str.length()-1;
		char[] rev = new char[str.length()];
		int x=0;
		
		for(int i= y; i>=0 ; i--)
			{
			rev[x] = str.charAt(i);
			
			x++;
		}
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(rev[i]);
		}

	}

}
