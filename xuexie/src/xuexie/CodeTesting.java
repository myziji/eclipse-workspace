package xuexie;


import java.util.HashMap;

public class CodeTesting {

	public static void main(String[] args) {
// code 1
//	int[] arr1= {1,2,3};
//	int[] arr2= {1,2,3};
//	System.out.println(arr1);
//	System.out.println(arr2);
//	if(arr1==arr2) {
//		System.out.println("same");
//	}
//	else {
//		System.out.println("no same");
//	}
//	}
// code 2
		
		HashMap<String,Integer> stringKeyHashMap = new HashMap<>();
		stringKeyHashMap.put("A", Integer.valueOf(1));
		stringKeyHashMap.put("A", Integer.valueOf(2));
		
		HashMap<String,Integer> customKeyHashMap = new HashMap<>();
		String key1A = new String("A");
		String key2A = new String("A");
		customKeyHashMap.put(key1A, Integer.valueOf(1));
		customKeyHashMap.put(key2A, Integer.valueOf(2));
		
		System.out.print(String.format("stringKeys : %s; customKey : %s",stringKeyHashMap.get("A"),customKeyHashMap.get(key1A)));
		
	}
		
		
		
		
		
		
		
		
		
}
