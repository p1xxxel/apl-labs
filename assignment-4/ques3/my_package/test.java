package my_package;

interface In1
{
	void Method1();
    	void Method2();
    	void Method3();
}

public class test implements In1
{
	public void Method1()
	{
		System.out.println("This is method 1 of interface In1");
	}

	public void Method2()
	{
		System.out.println("This is method 2 of interface In1");
	}

	public void Method3()
	{
		System.out.println("This is method 3 of interface In1");
	}
}