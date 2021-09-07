import java.util.*;
import sumAndMin.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		System.out.printf("\n====================================\nENTER FIVE NUMBERS : ");
		for(int i=0; i<5; i++){
			try{
				nums.add(sc.nextInt());
			}catch(InputMismatchException e){
				System.out.println("You entered an invalid number!");
			}
		}

		FindSum n1 = new FindSum();
		FindMin n2 = new FindMin();
		try{
			int ans = n1.ReturnSum(nums)/n2.ReturnMin(nums);
		}catch(ArithmeticException e){
			System.out.println("0 cannot be one of the numbers!");
			System.out.exit(0);
		}
		System.out.printf("\n===============ANSWER===============\n%d\n====================================\n", ans);
	}
}
