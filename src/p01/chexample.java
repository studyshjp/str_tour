package p01;

import java.util.List;

public class chexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. list content 2. stream 3. filter / contain 
		// 4. map / upper 5. align : sorted 6. output : foreach
		
		List<String> names = 
				List.of("abc","b","c");
		names.stream() 		
		// String Stream = names.stream();
		.filter(name -> name.contains("abc"))
		.map(name -> name.toUpperCase())
		.sorted()
		.forEach(name -> System.out.println(name));
		
		
		
	}

}
