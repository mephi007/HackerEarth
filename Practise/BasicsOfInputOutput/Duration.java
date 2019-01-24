import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int sh = in.nextInt();
		int sm = in.nextInt();
		int eh = in.nextInt();
		int em = in.nextInt();
		int min=0, hour =0;
		hour = eh-sh;
		if(em<sm )
		{
			min= 60-sm;
			min = min+em;
			hour--;
		}
		else
		{
			min = em-sm;
			
		}
		
		System.out.println(hour+" "+min);
	}

}
