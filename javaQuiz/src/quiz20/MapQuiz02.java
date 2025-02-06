package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuiz02 {

	public static void main(String[] args) {
		
		/*
		메뉴관리 시뮬레이터
		
		무한 반복문안에서 음식 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		
		* 음식메뉴는 key로 등록하고 가격은 value로 등록합니다.
		음식 메뉴 정보
		1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료
		
		1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록
		2. 메뉴와 가격을 전부 출력
		3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
		4. 변경할 메뉴를 받아서 메뉴가 있다면 삭제
		5. 프로그램 종료
		*/
		Map<String, Integer> map = new HashMap<>();
		while(true) {
			System.out.println("1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");
			Scanner sc=new Scanner(System.in);
			
			int a=sc.nextInt();
			switch (a) {
			case 1:
			    System.out.print("등록할 메뉴 입력: ");
			    String menu = sc.next(); 
			    if (map.containsKey(menu)) {
			        System.out.println("이미 등록된 메뉴입니다.");
			    } else {
			        System.out.print("메뉴의 가격 입력: ");
			        int price = sc.nextInt();
			        map.put(menu, price);
			        System.out.println(menu + " 메뉴가 등록되었습니다.");
			    }
				break;
			case 2:
				System.out.println(map.toString());
				break;
			case 3:
				System.out.println("수정 할 기존 메뉴: ");
				String modi = sc.next();
				if(map.containsKey(modi)) {
					System.out.print("수정 할 새 메뉴: ");
					String newMenu = sc.next();
//					System.out.print("수정 할 새 메뉴의 가격: ");
					int price = map.get(modi);
					map.remove(modi);
					map.put(newMenu, price);
				}else {
					System.out.println("메뉴가 없습니다.");
				}
				break;
			case 4:
				System.out.println("삭제 할 메뉴: ");
				String delete = sc.next();
				if(map.containsKey(delete)) {
					map.remove(delete);
					System.out.println(delete+"가 삭제 되었습니당.");
				}else {
					System.out.println("메뉴가 없습니다");
				}
					
				
				break;
			case 5:
				
			System.exit(1); // 프로그램 종료
				break;

			default:
				break;
			}
			
		}
		
		
		
		
	}
}
