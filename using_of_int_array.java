import java.util.Scanner;
public class using_of_int_array
{
	public static void main(String[] args)
	{
		int c=6;
		int []number=new int[6];
	for(int i=0;i<=5;i++)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter  intiger");
	 number[i]=input.nextInt();
	}
	while(c>=1)
	{
		c=c-1;
		System.out.println(""+number[c]);
	}
	
	}
}


