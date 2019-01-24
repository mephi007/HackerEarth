import java.util.Arrays;
import java.util.Scanner;

public class StringIdentical {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        int flag =0;
	        for(int i=0; i<t; i++)
	        {
	        String s1 = s.next().toLowerCase();
	        String s2 = s.next().toLowerCase();
	        
	        int[] occ1 = new int[26];
	        int[] occ2 = new int[26];
	        if(s1.length() == s2.length())
	        {
	        	for(int j=0; j<s1.length(); j++)
	        	{
	        		occ1[ s1.charAt(j)- 97]++;
	        		occ2[s2.charAt(j)- 97]++;
	        	}
	        	for(int l=0; l<26; l++)
	        	{
	        		if(occ1[l] != occ2[l])
	        		{
	        			flag=1;
	        			break;
	        		}
	        	
	        	}
	        	  if(flag ==1) System.out.println("NO");
	  	        else System.out.println("YES");
	        }
         
	        else
	        {
	            System.out.println("NO");
	        }
	        
	      
	        	
	      
	        
	       
	            
	        }
	        
	    }
	}