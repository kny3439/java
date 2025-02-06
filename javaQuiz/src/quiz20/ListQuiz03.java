package quiz20;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	public static void main(String[] args) {

		/*
		 * 회원정보 프로그램 시뮬레이터
		 * 
		 * 무한 반복문 안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 된다.
		 * 
		 * 메뉴
		 * 
		 * 1. 유저 등록 - 스캐너로 name, age입력 받아서 User객체를 리스트에 추가
		 * 
		 * 2. 전체회원 정보 출력 - 모든 회원 정보를 출력
		 * 
		 * 3. 회원 정보 검색 - 찾을 이름을 입력 받아서 이름이 있으면 이름과 나이 출력 찾는 이름 없으면 "~~님은 목록에 없습니다." 출력
		 * 
		 * 4. 회원 정보 삭제 - 삭제 할 이름을 입력 받아서, 동일 한 이름을 가진 회원이 있으면 User 삭제
		 * 
		 * 5. 프로그램 종료
		 * 
		 */

		System.out.println("1. 유저 등록 , 2. 전체회원 정보 출력 , 3. 회원 정보 검색 , 4. 회원 정보 삭제 삭제 , 5. 프로그램 종료");
		List<User> list = new ArrayList<>();
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();	

			switch (num) {
			case 1:
				String name = sc.next();
				int age = sc.nextInt();

				list.add(new User(name, age));
				
				break;
				
			case 2:
				 for (User user : list) {
                     System.out.println(user);
                 }
				break;
				
			case 3:

				String search = sc.next();
				boolean bool=true;
				
				for (int i = 0; i < list.size(); i++) {
					User u=list.get(i);
					String name2=u.getName();
					
					if (search.equals(name2)) {
						System.out.println("찾은 정보: "+u.getName()+" "+u.getAge());
						bool=false;
					}
				}
				
				if(bool) {
					System.out.println("목록에 없습니다");
				}

				break;
			case 4:
				String delete = sc.next();
				boolean bool2=true;
				
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(delete)) {
						 list.remove(i);
						System.out.println(delete+"삭제 \n");
						bool2=false;
					}
				}
				if(bool2) {
					System.out.println("목록에 없음");
				}

				break;
			case 5:
				System.out.println("프로그램 종료");
				break;

			default:
				System.out.println("해당하는 메뉴 없음");
				break;
			}

		}

	}
}
