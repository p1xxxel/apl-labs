import java.util.*;

public class FindMin{
	int ReturnMin(ArrayList<Integer> list){
		if (list == null || list.size() == 0)
			System.out.println("Empty List!");
		List<Integer> sortedList = new ArrayList<>(list);
		Collections.sort(sortedList);
		return sortedList.get(0);
	}
}
