import java.util.*;
class rectangle{
	public void calcArea(double length, double breadth){
		System.out.printf("%.5f",length*breadth);
	}
}
class newRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		double l = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double b = sc.nextDouble();
		rectangle r1 = new rectangle(); 
		r1.calcArea(l,b);
	}
}
