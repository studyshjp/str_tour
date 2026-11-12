package p01;

import java.util.List;
// import java.util.jar.Attributes.Name;

public class testapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 객체 list 2. list data 시작번호 0
		// 3. foreach getName 이름 불러오기
		/*
		List<Name> names = List.of(
				new Name("a","ㄱ",3,100,"1"),
				new Name("b","ㄴ",5,100,"2"),
				);
		*/
		
		// private static final List<Monster> monsters = List.of(
				List<Monster> monsters = List.of(
				
	            new Monster("슬라임", "일반", 3, 100, "물"),
	            new Monster("불꽃이", "희귀", 8, 350, "불"),
	            new Monster("버섯돌이", "일반", 5, 180, "풀"),
	            new Monster("꼬마드래곤", "전설", 20, 1500, "불"),
	            new Monster("얼음토끼", "희귀", 12, 700, "얼음"),
	            new Monster("돌멩이", "일반", 2, 80, "땅")
	    );
		/*
		System.out.println(names.size()); // list data 갯수
		System.out.println(names.get(0) // list data 시작번호 0
		*/
		
		System.out.println(monsters.size()); // list data
		System.out.println(monsters.get(0)); // list data
		// names.get(0)	// 목록 위치 시작번호 0
		
		System.out.println("-------------------------");
		
		// .getName();	// 이름 불러오기
		// list data 1. stream / filter foreach 2. getName getInfo
		monsters.stream()
		// 
		.map(monster -> monster.getName())
		.forEach(name -> System.out.println(name));
		
		long totalCount = monsters.stream().count();
		System.out.println("total =" + totalCount);
		
		// list
		
		
		// .filter (monster -> monster.getLevel() >= 10);
		// .filter(monster -> monster.getGrade().equals("ab"));
		monsters.stream().forEach
		(monster -> System.out.println(monster.getName()));
		monsters.stream().forEach
		(monster -> System.out.println(monster.getInfo()));
		/*
		monsters.stream();
		.forEach(monster -> System.out.println(monster.getName));
		*/
	}

}
