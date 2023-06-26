package memo.entity;

import java.util.Comparator;

public class MemoIdxComparator implements Comparator<Memo> {

	//idx를 기준으로 내림차순
	@Override
	public int compare(Memo memo1, Memo memo2) {
		if (memo1.getIdx() > memo2.getIdx()) {
			return 1;
		} else if (memo1.getIdx() < memo2.getIdx()) {
			return -1;
		} else {
			return 0;
		}
	}
}
