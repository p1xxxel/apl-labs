import Animals.*;

class ques6
{
	public static void main(String args[])
	{
		Lion l=new Lion();
		Deer d=new Deer();
		Bear b=new Bear();
		abstract_class a=new abstract_class();

		l.show();
		l.display();
		d.display();

		System.out.println("");

		b.Method1();
		b.Method2();
		b.Method3();

		
		System.out.println("");

		a.facial();
		a.skin();
		a.color();			
	}
}
