import java.util.*;
class boxes{
	public boxes(double height,double width,double depth){
		System.out.printf("%.5f",height*width*depth);
	}
}
class newBoxes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height : ");
		double h = sc.nextDouble();
		System.out.println("Enter width : ");
		double w = sc.nextDouble();
		System.out.println("Enter depth : ");
		double d = sc.nextDouble();
		boxes box1 = new boxes(h,w,d); 
	}
}
