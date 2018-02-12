import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	public static void nextGreater(int[] arr){
		Stack<Integer> s = new Stack<>();
		Map<Integer,Integer> greaterMap = new HashMap<>();
		//int greatest = Integer.MIN_VALUE;
		for(int i: arr){
			if(s.isEmpty() || s.peek()>i){
				s.push(i);
				greaterMap.put(i, -1);
			}else{
				
				while(!s.isEmpty() && s.peek()<i){
					int key = s.pop();
					//int value = greaterMap.get(key);
					greaterMap.put(key, i);
					greaterMap.put(i, -1);
				}
				s.push(i);
			}
		}
		System.out.println(greaterMap.toString());
	}

	public static void main(String[] args) {
		int arr[] = {4,5,2,25};
		int arr2[] = {13,7,6,12};
		nextGreater(arr2);
	}

}
