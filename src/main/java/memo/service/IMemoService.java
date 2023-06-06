package memo.service;

import memo.entity.Memo;

public interface IMemoService {

	// 입력 기능
	Memo createMemo();

	// 수정 기능
	void updateMemo();

	// 삭제 기능
	void deleteMemo();
}
