package memo.entity;

import java.time.LocalDateTime;

public class Memo {
	private int idx; // 글 번호
	private String name; // 작성자 이름
	private String password; // 비밀번호
	private String memoContent; // 게시글
	private LocalDateTime createdAt; // 작성일(컴퓨터 시스템의 날짜와 시간을 자동으로 저장)

	public Memo(int idx, String name, String password, String memoContent) {
		this.idx = idx;
		this.name = name;
		this.password = password;
		this.memoContent = memoContent;
		this.createdAt = LocalDateTime.now();
	}

	public int getIdx() {
		return idx;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getMemoContent() {
		return memoContent;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public void setMemoContent(String memoContent) {
		this.memoContent = memoContent;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Memo{" +
			"idx=" + idx +
			", name='" + name + '\'' +
			", password='" + password + '\'' +
			", memoContent='" + memoContent + '\'' +
			", createdAt=" + createdAt +
			'}';
	}
}
