package memo;

import memo.service.MemoService;

public class MemoApplication {
	public static void main(String[] args) {

		MemoService memoService = new MemoService();

		memoService.createMemo();
	}
}
