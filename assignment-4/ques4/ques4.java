class sorting
{
	int arr[]={4,7,1,2,3,8,9,0,5,6};

	public void sort(int n)
	{
		try
		{
			for (int i = 0; i < n-1; i++)
			{
            			for (int j = 0; j < n-i-1; j++)
				{
                			if (arr[j] > arr[j+1])
               			 	{
                    				int temp = arr[j];
                    				arr[j] = arr[j+1];
                    				arr[j+1] = temp;
                		 	}
				}
			}
		}
		catch(Exception e)
		{
			System.out.print("An error occured !!");
		}
	}

	public void display()
	{	
		System.out.print("Sorted numbers are: ");
	
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


class divide
{
	int arr[]={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
	
	public void division(int n)
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				arr[i]=arr[i]/n;
			}
		}
		catch(Exception e)
		{
			System.out.print("Integer number cannot be divide with 0");
		}
	}

	public void display()
	{	
		System.out.print("New array is: ");
	
		for(int i=0;i<15;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	
}

class ques4
{
	public static void main(String args[])
	{
		sorting s=new sorting();
		divide d=new divide();
	
		s.sort(10);
		s.display();

		System.out.println("");

		d.division(0);

		System.out.println("");

		d.division(10);
		d.display();
	}
}
