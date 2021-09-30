 import java.util.Scanner;
class Qns4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the num u want:");
		n =s.nextInt();
		if(n<=0)
		{
			System.out.println("Enter valid input");
		}
		else
		{

			int inputArray1[] = new int[n];
			int inputArray2[] = new int[n];
			
			System.out.println("The array elements :");
			for(int i=0;i<n;i++)
			{
				inputArray1[i] = s.nextInt();
				
			}
			
			int j=0;
			
			for(int i=n-1;i>=0;i--)
			{
				inputArray2[i] = inputArray1[j];
				j++;
			}
			System.out.println("The reverse array elements are:");

			for(int i=0;i<n;i++)
			{
				System.out.println(inputArray2[i] );
				
			}
		}
	}
}
