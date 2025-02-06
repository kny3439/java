package collection.map;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		// 사용 방법은 HashMap과 같다
		// 키를 -> 정렬 시켜서 저장한다
		
		TreeMap<Integer,String> map=new TreeMap<>();
		
		
		map.put(2,"a");
		map.put(3,"b");
		map.put(5,"c");
		map.put(1,"밥먹자");
		
		System.out.println(map.toString());
		
		
		
	}
}
