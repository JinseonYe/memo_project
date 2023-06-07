package memo.entity;

import java.util.Comparator;

public class MemoDateComparator implements Comparator<Memo> {
	@Override
	public int compare(Memo o1, Memo o2) {
		return o1.getCreatedAt().compareTo(o2.getCreatedAt()) * -1;
	}
}
