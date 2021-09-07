import java.util.*;

public class FindSum{
	int ReturnSum(ArrayList<Integer> list){
		int result=0;
		for(Integer num:list)
			result = result + num;
		return result;
	}
}
