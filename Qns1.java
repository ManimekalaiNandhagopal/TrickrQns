import java.util.Scanner;
class Qns1 
{
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner (System.in);
		int n;
		
		System.out.println("Enter the num u want:");
		n =s.nextInt();
		
		if(n<=0)
		{
			System.out.println("Enter valid input");
		}
		else
		{
			int usrInput[] = new int[n];
			System.out.println("Enter the elements:");		
			for(int i=0;i<n;i++)
			{
					usrInput[i]=s.nextInt();
			}
			System.out.println("The elements are:");	
			for(int i=0;i<n;i++)
			{
				System.out.print( usrInput[i] + "\t");
			}
		}	
		
	}
}
