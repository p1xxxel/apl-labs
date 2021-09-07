import java.util.*;

class Main{
	public static void main(String args[]){
		System.out.println("Demonstration of finally block");
		System.out.println("======================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		Integer n1=null, n2=null, result=null;
		System.out.println("Enter two numbers to divide : ");
		try{
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}catch(InputMismatchException e1){
			System.out.println("An Error Occured : You entered an invalid number");
		}finally{
			System.out.println("Now inside finally block");
			if(n1 == null || n2 == null){
				System.exit(0);
			}
			try{
				result = n1/n2;
			}catch(ArithmeticException e2){
				System.out.println("An Error Occured : Dividing by zero is not allowed");
				System.exit(0);
			}
			System.out.println("RESULT");
			System.out.println("======================================");
			System.out.println(result);
		}
	}
}
