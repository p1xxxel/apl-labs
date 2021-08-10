import java.util.*;
class minMaxIfElse{
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
		if(num1 >= num2 && num1 >= num3 && num1 >= num4){
			System.out.println("Maximum : "+num1);
		}
		else if(num2 >= num3 && num2 >= num1 && num2 >= num4){
			System.out.println("Maximum : "+num2);
		}
		else if(num3 >= num1 && num3 >= num2 && num3 >= num4){
			System.out.print("Maximum : "+num3);
		}
		else{
			System.out.println("Maximum : "+num4);
		}
		if(num1 <= num2 && num1 <= num3 && num1 <= num4){
			System.out.println("Minimum : "+num1);
		}
		else if(num2 <= num3 && num2 <= num1 && num2 <= num4){
			System.out.println("Minimum : "+num2);
		}
		else if(num3 <= num1 && num3 <= num2 && num3 <= num4){
			System.out.print("Minimum : "+num3);
		}
		else{
			System.out.println("Minimum : "+num4);
		}
	}
}
