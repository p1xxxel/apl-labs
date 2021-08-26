import java.util.*;
class binToDec{
	static boolean isBin(String binary){
		for(int i = 0; i < binary.length(); i++) {
		     int tempB = binary.charAt(i);
		     if (tempB == '0' || tempB == '1') {
		          continue; 
		                   
		      }
		      return false;
		}
		return true;
	}

	static int binToDec(String binary, int i){
		int n = binary.length();
		if(i+1 == n){
			return binary.charAt(i)-'0';
		}

		return ((binary.charAt(i)-'0') << (n-i-1)) + binToDec(binary, i+1);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number to convert : ");
		String binary = sc.nextLine();
		if(isBin(binary.trim())){
			System.out.printf("\n====================\nResult : %d\n====================\n", binToDec(binary.trim(),0));
		}
		else{
			System.out.printf("\n====================\nERROR : Not a binary\n====================\n");
		}
	}
}

