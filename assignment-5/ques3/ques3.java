import java.util.*;
import java.io.*;

class UncheckedExcep{
	void ThrowUnchecked(){
		System.out.println("===============================");
		System.out.println("UNCHECKED EXCEPTION");
		System.out.println("===============================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers :");
		int ar[] = new int[5]; 

		for(int i=0; i<5; i++){
			// Handles InputMismatchException
			do{
				try{
					ar[i] = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("You entered an invalid number!");
					sc.nextLine();
					System.out.println("Enter a valid number :");
				}
			}while(ar[i] <= 0);
		}

		System.out.println("Enter the position of the number to print :");
		// Handles InputMismatchException
		int index = 0;
		do {
			try{
				index = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("You entered an invalid number!");
				sc.nextLine();
				System.out.println("Enter a valid number :");
			}
		}while(index <= 0);
		int result = 0;

		// Handles ArrayIndexOutOfBoundsException
		try {
			result = (ar[index-1]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("You entered a position not between 1 and 5");
			System.exit(0);
		}finally {
			System.out.println("Number at the specified position " + result);
		}
	}
}

class CheckedExp{
	void ThrowChecked(){
		System.out.println("===============================");
		System.out.println("CHECKED EXCEPTION");
		System.out.println("===============================");
		System.out.println();
		System.out.println("Enter complete location of the file : ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		BufferedReader fileInput = null;
		// Handling the FileNotFoundException
		try{
			FileReader file = new FileReader(fileName);
			fileInput = new BufferedReader(file);
		}catch (FileNotFoundException e){
			System.out.println("No such file exists! Using the default test file...");
			try{
				FileReader file = new FileReader("./testFile.txt");
				fileInput = new BufferedReader(file);
			}catch (FileNotFoundException e2){
				System.out.println("Someone has deleted the test file. The program will exit now...");
			}
		}finally{
			System.out.println("Printing the first line of the file :");
			try {
				System.out.println(fileInput.readLine());
				fileInput.close();
			}catch (IOException e3){
				System.out.println("An error occured while reading file!");
				System.out.println("Please try again with a different file...");
			}
		};

		// Handling the ClassNotFoundException
		System.out.println();
		System.out.println();
		System.out.println("Enter a class to load");
		String className = sc.nextLine();
		System.out.println("Loading the specified class...");
		try{
			Class.forName(className);
		}catch (ClassNotFoundException e){
			System.out.println("The specified class does not exist!");
		};
	};
};


class Main{
	public static void main(String args[]){
		UncheckedExcep u1 = new UncheckedExcep();
		u1.ThrowUnchecked();
		CheckedExp c1 = new CheckedExp();
		c1.ThrowChecked();
	};
};

