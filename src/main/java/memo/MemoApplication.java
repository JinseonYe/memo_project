package memo;

import java.util.Scanner;

import memo.service.MemoService;

public class MemoApplication {
	public static void main(String[] args) {

		MemoService memoService = new MemoService();

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------메모장 프로그램입니다.------------");
			System.out.println("-----------원하시는 동작을 선택하세요.-----------");
			System.out.println("1.입력 | 2.목록 보기 | 3.수정 | 4.삭제 | 5.종료메뉴");
			System.out.print("번호 : ");

			int selectMenu = sc.nextInt();
			if (selectMenu == 1) {
				System.out.println("메모를 입력합니다.");
				memoService.createMemo();
			} else if(selectMenu == 2) {
				System.out.println("메모 목록을 조회합니다.");


			} else if(selectMenu == 3) {
				System.out.println("메모를 수정합니다.");


			} else if(selectMenu == 4) {
				System.out.println("메모를 삭제합니다.");


			} else if(selectMenu == 5) {
				break;
			} else {
				System.out.println("번호를 다시 입력해주세요.");
			}
		}

	}
}
