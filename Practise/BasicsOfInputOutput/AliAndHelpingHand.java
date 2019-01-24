import java.util.Scanner;

public class AliAndHelpingHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		char[] charArray = str.toCharArray();
		int flag=0;
		int sum =0;
		if(charArray[2] == 'A' || charArray[2] == 'E' || charArray[2] == 'I' ||charArray[2] == 'O' ||charArray[2] == 'U' ||charArray[2] == 'Y')
		{
			flag=1;
		}
		
		else if((charArray[0]+charArray[1])%2 !=0)
		{
			flag=1;
		}
		else if((charArray[7]+charArray[8])%2 !=0)
		{
			flag=1;
		}
		
		for(int i =4; i<6; i++)
		{
			sum = charArray[i] + charArray[i-1];
			if(sum%2 != 0){ 
				flag =1;
				break;
				
				}
		}
		
//		for(int i=1; i<=charArray.length; i++)
//		{
//			int sum = 0;
//			if(i == 1 || i == 7)
//			{
//				i = i+2;
//			}
//			else 
//				{sum = charArray[i] + charArray[i-1];}
//			
//			if(sum%2 != 0){ 
//				flag =1;
//				break;
//				
//				}
//			
//		
//		}
		
		if(flag == 1)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("valid");
		}

	}

}
