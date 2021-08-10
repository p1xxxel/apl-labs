import java.util.*;
class minMaxTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
                int num1 = sc.nextInt();
                System.out.println("Enter second number : ");
                int num2 = sc.nextInt();
                System.out.println("Enter third number : ");
                int num3 = sc.nextInt();
                System.out.println("Enter fourth number : ");
                int num4 = sc.nextInt();
		int max = (num1 > num2) ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4) ) : (num2 > num3 ? (num2 > num4 ? num2 : num4) : (num3 > num4 ? num3 : num4) );
		int min = (num1 < num2) ? (num1 < num3 ? (num1 < num4 ? num1 : num4) : (num3 < num4 ? num3 : num4) ) : (num2 < num3 ? (num2 < num4 ? num2 : num4) : (num3 < num4 ? num3 : num4) );
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}
