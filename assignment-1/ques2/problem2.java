import java.util.*;
class addTwo {
	public addTwo(double num1, double num2){
		System.out.printf("Adding numbers %.5f, %.5f\n", num1, num2);
		System.out.printf("%.5f\n\n", num1+num2);
	}
}
class addThree {
	public addThree(double num1, double num2, double num3){
		System.out.printf("Adding numbers %.5f, %.5f, %.5f\n", num1, num2, num3);
		System.out.printf("%.5f\n\n",num1 + num2 + num3);
	}
}
class addFour {
	public addFour(double num1, double num2, double num3, double num4){
		System.out.printf("Adding numbers %.5f, %.5f, %.5f, %.5f\n", num1, num2, num3, num4);
		System.out.printf("%.5f\n\n",num1+num2+num3+num4);
	}
}
class Addition{
	public static void main(String[] args){
		addTwo obj1 = new addTwo(1.1,2.1);
		addThree obj2 = new addThree(5.11,2.5,3.7);
		addFour obj3 = new addFour(8.1,9.2,4.112,5.9);
	}
}
