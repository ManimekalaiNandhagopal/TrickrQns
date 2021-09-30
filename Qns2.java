import java.util.Scanner;

class Qns2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int num;
		System.out.println("Enter the num u want:");
		num =s.nextInt();
		if(num<=0)
		{
			System.out.println("Enter valid input");
		}
		else
		{

			int inp[] = new int[num];
			int n,count=0;
			System.out.println("Enter the  elements :");
			for(int i=0;i<num;i++)
			{
				inp[i] = s.nextInt();
			}
			System.out.println("The elements are:");
			for(int i=0;i<num;i++)
			{
				System.out.println( inp[i] + "\t");
			}
		
			System.out.println("Enter the number to be checked:");
		
			n=s.nextInt();
			for(int i=0;i<num;i++)
			{
				if(inp[i]==n)
				{
					count++;
				}	
			}
			if(count>0)
			{
				System.out.println( n + " is present in array");
			}
			else 
			{
				System.out.println( n + " is not present in array");
			}
		}

	}
}
