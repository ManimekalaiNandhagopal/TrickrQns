import java.util.Scanner;

class Qns3
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

			int input[] = new int[n];
			int count1=0;
			int count2=0;
			int count3=0;
			int count4=0;
			int count5=0;
			
			System.out.println("Enter elements :");
			for(int i=0;i<n;i++)
			{
				input[i]=s.nextInt();
			}
			for (int i=0;i<n;i++)
			{
				if(input[i]>0)
				{
					count1++;
				}
				if(input[i]<0)
				{
					count2++;
				}
				if(input[i]%2==0)
				{
					count3++;
				}
				if(input[i]%2==1)
				{
					count4++;
				}
				if(input[i]==0)
				{
					count5++;
				}

			}
			System.out.println(" Number of Positive's: " +count1);
			System.out.println(" Number of Negative's: " +count2);
			System.out.println(" Number of Even is : " +count3);
			System.out.println(" Number of Odd is: " +count4);
			System.out.println(" Number of Zero's: " +count5);
		}

	}
}
