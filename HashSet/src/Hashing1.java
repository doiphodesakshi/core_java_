import java.util.HashMap;

public class Hashing1 {
	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap<>();
		map.put("India" ,120);
		map.put("US" ,70);
		map.put("China" ,150);
		System.out.println(map);
		if(map.containsKey("US")) {
			System.out.println("key is present in map");
		}else {
			System.out.println("key is not present");
		}
		if(!map.containsKey("indoneshia")) {
			System.out.println("key is not present in map");
			
		}
		System.out.println(map.get("China"));
		System.out.println(map.get("US"));
		System.out.println(map.get("indoneshia"));
		System.out.println(map.get("pakistan"));
	}

}
