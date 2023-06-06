package memo.service;

import java.util.Scanner;

import memo.entity.Memo;

public class MemoService implements IMemoService {

	// 입력 기능
	@Override
	public Memo createMemo() {
	Scanner sc = new Scanner(System.in);
	System.out.print("이름 입력 : ");
	String name = sc.next();
	System.out.print("비밀번호 입력 : ");
	String password = sc.next();
	System.out.print("메모 입력 : ");
	String memoContent = sc.next();
	System.out.println("메모 내용 : " + memoContent);
	System.out.println("메모가 생성되었습니다.");
	return new Memo(name, password, memoContent);
	}

	// 수정 기능
	@Override
	public void updateMemo() {

	}
	// 삭제 기능
	@Override
	public void deleteMemo() {

	}
}
