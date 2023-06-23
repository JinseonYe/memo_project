package memo.entity;

import java.util.Comparator;

public class MemoDateComparator implements Comparator<Memo> {
	@Override
	public int compare(Memo memo1, Memo memo2) {
		return (memo1.getCreatedAt()).compareTo(memo2.getCreatedAt());
	}
}
