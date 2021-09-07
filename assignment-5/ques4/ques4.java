import java.util.*;

class ques4{
	void Fourth(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Fourth");
		System.out.println("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.printf("Dividing %d by %d\n", n1, n2);
		int a = n1/n2;
		System.out.println("Result : "+a);
	}
	void Third(){
		System.out.println("Third");
		Fourth();
	}
	void Second(){
		System.out.println("Second");
		Third();
	}
	void First(){
		System.out.println("First");
		Second();
	}
}

class Main{
	public static void main(String args[]){
		ques4 q = new ques4();
		try{
			q.First();
		}catch (ArithmeticException e){
			System.out.println("Handled arithemetic exception");
		}
	}
}
