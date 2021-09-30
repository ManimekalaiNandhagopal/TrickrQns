import java.util.Scanner;

class Qns5 
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
			int Inp[] = new int[n];
			System.out.println("Enter the elements:");
			for( int i=0; i<n;i++)
			{
				Inp[i] = s.nextInt();
			}
			boolean read = true;
			int j=5;
			for(int i=0;i<n/2;i++)
			{
				if(Inp[i]!=Inp[j])
					{
						read = false;
						break;
					}
				else
					{
						j--;
					}
			}
			if(read==true)
			{
				System.out.println("Array is Same From the Front and Back");
			}
			else
			{
				System.out.println("Array is not Same From the Front and Back");
			}
		}


	 
	}
}







/*int a[] = {2,3,15,15,3,2};
    int read = 1;
    int i,j = 5;
    for(i =0;i<6/2;i++)
    {
        if(a[i]!=a[j])
        {
            read = 0;
            break;
        }
        else
            j--;
    }
    cout << read << "\n";
    return 0;
}*/					