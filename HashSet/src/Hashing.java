import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
	public static void main(String[] args) {
		HashSet<Integer> set= new HashSet<>();
		set.add(1);
		set.add(6);
		set.add(8);
		set.add(4);
		System.out.println(set);
		System.out.println("size of set: " +set.size());
		if(set.contains(7)) {
			System.out.println("set contain 1");
		}
		else {
			System.out.println("set doesnt contain 1");
		}
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
