import java.util.Scanner;

public class Goki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num+1];
		
		for(int i=0; i<=num; i++)
		{
			arr[i] = in.nextInt();
		}
		
		for(int i=1; i<=num; i++)
		{
			if( arr[i] > arr[i-1])
			{
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
		
		

	}

}
