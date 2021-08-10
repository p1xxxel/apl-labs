import java.util.*;
class circle{
	public circle(double radius){
		System.out.printf("%.5f",3.14*radius*radius);
	}
}
class newCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r = sc.nextDouble();
		circle c1 = new circle(r); 
	}
}
