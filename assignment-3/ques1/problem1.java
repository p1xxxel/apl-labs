import java.util.*;
class Student{
	static String name;
	static int roll_number;
	static int phone_number;

	static void take_inputs(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter roll number : ");
		roll_number = sc.nextInt();
		System.out.println("Enter phone number : ");
		phone_number = sc.nextInt();
	}

	static void display_info(){
		System.out.println("====================");
		System.out.printf("Name : %s\n",name);
		System.out.printf("Roll number : %3d\n", roll_number);
		System.out.printf("Phone number : %10d\n", phone_number);
	}
}

class Teacher extends Student{
	static String name;
	static String area_of_teaching;

	static void take_inputs(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter the area of teaching : ");
		area_of_teaching = sc.nextLine();
	}
	
	static void display_info(){
		System.out.println("====================");
		System.out.printf("Name : %s\n",name);
		System.out.printf("Area of teaching : %s\n", area_of_teaching);
	}

	static class Science{
		static int number_of_students;

		static void get_number(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of students in Science : ");
			number_of_students = sc.nextInt();
		}
		
		static void print_number(){
			System.out.printf("The number of students in Science class are %d\n", number_of_students);
		}
	}

	static class Arts{
		static int number_of_students;

		static void get_number(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of students in Arts : ");
			number_of_students = sc.nextInt();
		}
		
		static void print_number(){
			System.out.printf("The number of students in Arts class are %d\n", number_of_students);
		}
	}

	static class Commerce{
		static int number_of_students;

		static void get_number(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of students in Commerce : ");
			number_of_students = sc.nextInt();
		}
		
		static void print_number(){
			System.out.printf("The number of students in Commerce class are %d\n", number_of_students);
		}
	}
}

class Staff extends Student{
	static String name;
	static String work;

	static void take_inputs(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter your work: ");
		work = sc.nextLine();
	}
	
	static void display_info(){
		System.out.println("====================");
		System.out.printf("Name : %s\n",name);
		System.out.printf("Work: %s\n", work);
	}
}
