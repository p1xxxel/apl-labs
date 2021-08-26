import java.util.*;
abstract class Arithmetic{
	public abstract int Addition(int n1, int n2);
	public abstract int Subtraction(int n1, int n2);
	public abstract int Multiplication(int n1, int n2);
	public abstract int Division(int n1, int n2);
}

class main extends Arithmetic{
	public int Addition(int n1, int n2){
		System.out.printf("Adding %d and %d\n",n1,n2);
		return n1+n2;
	}

	public int Subtraction(int n1, int n2){
		System.out.printf("Subtracting %d from %d\n",n2,n1);
		return n1-n2;
	}

	public int Multiplication(int n1, int n2){
		System.out.printf("Multiplying %d and %d\n",n1,n2);
		return n1*n2;
	}

	public int Division(int n1, int n2){
		System.out.printf("Dividing %d by %d\n",n1,n2);
		return n1/n2;
	}

	public static void main(String args[]){
		Arithmetic obj = new main();
		System.out.println(obj.Addition(1,2));
		System.out.println(obj.Subtraction(33,8));
		System.out.println(obj.Multiplication(25,5));
		System.out.println(obj.Division(12,6));
	}
}

