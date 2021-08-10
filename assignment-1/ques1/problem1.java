import java.util.*;
class calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a SIMPLE Calculator. It supports the following operations.\n\n>> '+' for ADDITION\n>> '-' for SUBTRACTION\n>> '*' for MULTIPLICATION\n>> '/' for DIVISION\n>> 'AND' for LOGICAL AND\n>> 'OR' for LOGICAL OR\n>>'NOT' for LOGICAL NOT\n");
		String operation = sc.nextLine();
		if (Arrays.asList("+","-","*","/").contains(operation)){
			System.out.println("Enter 1st number : ");
			double num1 = sc.nextDouble();
			System.out.println("Enter 2nd number : ");
			double num2 = sc.nextDouble();
			System.out.println("\nResult : ");
			if (operation.equals("+")){
				System.out.printf("%.5f",num1+num2);
			}
			else if (operation.equals("-")){
				System.out.printf("%.5f",num1-num2);
			}
			else if (operation.equals("*")){
				System.out.println(num1*num2);
			}
			else if (operation.equals("/")){
				System.out.println(num1/num2);
			}
		}
		else if (operation.equalsIgnoreCase("AND") || operation.equalsIgnoreCase("OR")){
			System.out.println("Enter 1st boolean : ");
			boolean bn1 = sc.nextBoolean();
			System.out.println("Enter 2nd boolean : ");
			boolean bn2 = sc.nextBoolean();
			System.out.println("\nResult : ");
			if (operation.equalsIgnoreCase("AND")){
				System.out.println(bn1 && bn2);
			}
			else if (operation.equalsIgnoreCase("OR")){
				System.out.println(bn1 && bn2);
			}
		}
		else if (operation.equalsIgnoreCase("NOT")){
			System.out.println("Enter boolean");
			boolean bn = sc.nextBoolean();
			System.out.println("\nResult : ");
			if (operation.equalsIgnoreCase("NOT")){
				System.out.println(!bn);
			}
		}
		else{
			System.out.println("Unsupported Operation\n");
		}
//		System.out.print("You have entered :"+operation);
//		if (operation.equals("+")){
//			System.out.println(num1+num2);
//		}
//		else if (operation.equals("-")){
//			System.out.println(num1-num2);
//		}
//		else if (operation.equals("*")){
//			System.out.println(num1*num2);
//		}
//		else if (operation.equals("/")){
//			System.out.println(num1/num2);
//		}
//		else if (operation.equalsIgnoreCase("AND")){
//			System.out.println(bn1 && bn2);
//		}
//		else if (operation.equalsIgnoreCase("OR")){
//			System.out.println(bn1 && bn2);
//		}
//		else if (operation.equalsIgnoreCase("NOT")){
//			System.out.println(!bn);
//		}

	}
}
