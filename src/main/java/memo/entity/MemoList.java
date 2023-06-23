package memo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoList {

	List<Memo> memoList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	//리스트에 메모 추가
	public void add() {
		int idx = memoList.size() + 1;
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("비밀번호 입력 : ");
		String password = sc.next();
		System.out.print("메모 입력 : ");
		String memoContent = sc.next();
		System.out.println("메모가 생성되었습니다.");
		memoList.add(new Memo(idx, name, password, memoContent));
	}

	//최신 작성 순으로 메모 리스트 출력
	public void getMemoList() {
		memoList.sort(new MemoDateComparator().reversed());
		for (Memo memo : memoList) {
			System.out.println(memo);
		}
	}
}
