package dummy;

import java.util.HashMap;

public class HMPratise {
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(100, 2);
		hm.put(200, 3);
		hm.put(300, 1);
		hm.put(400, 9);
		hm.put(100, 5);
		
		System.out.println(hm);
		System.out.println(hm.get(100));
		System.out.println(hm.getOrDefault(500,7));
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		System.out.println(hm.containsKey(500));
		System.out.println(hm.containsValue(3));
	}
}
