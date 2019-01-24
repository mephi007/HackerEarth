import java.util.ArrayList;
import java.util.Scanner;

public class toggleString {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        String str = s.next();
	        
	        char[] st = str.toCharArray();
	        ArrayList<Character> toggle = new ArrayList<>();
	        for(int i=0; i<st.length; i++)
	        {
	            if(st[i] >= 'A' && st[i] <= 'Z')
	            {
	                toggle.add((char) ((int)st[i] + 32));
	            }
	            if(st[i] >= 'a' && st[i] <= 'z')
	            {
	                toggle.add((char) ((int)st[i] - 32));
	            }
	        }
	        for(int i=0; i<st.length; i++)
	        {
	            System.out.print(toggle.get(i));
	        }

	    }
	}