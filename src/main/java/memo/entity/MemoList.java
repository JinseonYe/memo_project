package memo.entity;

import java.time.LocalDateTime;
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

	public Memo getIndex(int idx) {
		return memoList.get(idx);
	}

	//메모 수정
	public void updateMemo() {
		System.out.println("수정할 메모의 번호 입력 : ");
		int idx = sc.nextInt();
		if (getIndex(idx) == null) {
			System.out.println("메모가 존재하지 않습니다.");
		} else {
			System.out.println("비밀번호 : ");
			String password = sc.next();
			Memo memo = memoList.get(idx);
			if (password.equals(memo.getPassword())) {
				System.out.println("수정할 내용 입력 : ");
				String memoContent = sc.next();
				memo.setMemoContent(memoContent);
				memo.setCreatedAt(LocalDateTime.now());
				System.out.println("성공적으로 수정되었습니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}
}
