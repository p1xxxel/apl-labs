import java.util.*;

abstract class Citizen{
	String Name;
	String AadharNumber;
	String PhoneNumber;
	int age;
	Citizen(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		this.Name = sc.nextLine();
		System.out.println("Enter your aadhar number : ");
		this.AadharNumber = sc.nextLine();
		System.out.println("Enter your phone number : ");
		this.PhoneNumber = sc.nextLine();
		System.out.println("Enter your age : ");
		this.age = sc.nextInt();
	}

	abstract void verifyAge();
}

class Vaccine extends Citizen{
	void verifyAge(){
		if (this.age < 18){
			throw new ArithmeticException("Citizens below 18 years of age are not allowed!");
		}
	}
}
