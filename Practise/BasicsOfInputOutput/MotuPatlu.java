import java.util.Scanner;

public class MotuPatlu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int brick = in.nextInt();
		int patlu=0,motu = 0;
		int N= brick;
		int f=0;
		for(int i=1; i<= brick; i++)
		{
			if(N>patlu)
			{
				patlu = i;
				N = N- patlu;
				if(N > motu)
				{
					motu = 2*i;
					N = N-motu;
				}
				else
				{
					motu = brick -N;
					f=0;
					break;
				}
			}
			else
			{
				patlu = brick-N;
				f=1;
			}
		}
		if(f==0) System.out.println("Motu");
		else System.out.println("Patlu");
		

	}

}
