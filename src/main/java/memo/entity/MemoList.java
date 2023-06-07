package memo.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoList {
	// 여러 건의 메모를 저장하는 리스트
	private List<Memo> memoList = new ArrayList<Memo>();

	// 메모 전체 조회
	public List<Memo> getMemoList() {
		// 최신에 작성한 순서로 메모를 출력한다.
		memoList.sort(new MemoDateComparator());
		return memoList;
	}

	// 메모 추가
	public void add(Memo memo){
		memoList.add(memo);
	}

	// 메모 수정 또는 삭제 시 메모 번호로 해당 메모를 리턴
	public Memo getMemoIndex(int idx){
		return memoList.get(idx);
	}

	public Memo remove(int idx){
		return memoList.remove(idx);
	}
}
