import java.util.*;
import sumAndMin.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		System.out.printf("\n====================================\nENTER FIVE NUMBERS : ");
		for(int i=0; i<5; i++){
			nums.add(sc.nextInt());
		}

		FindSum n1 = new FindSum();
		FindMin n2 = new FindMin();
		int ans = n1.ReturnSum(nums)/n2.ReturnMin(nums);
		System.out.printf("\n===============ANSWER===============\n%d\n====================================\n", ans);
	}
}
