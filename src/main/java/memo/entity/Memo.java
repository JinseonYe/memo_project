package memo.entity;

import java.time.LocalDateTime;

public class Memo {
	int idx; // 글 번호
	String name; // 작성자 이름
	String password; // 비밀번호
	String memoContent; // 게시글
	LocalDateTime createdAt; // 작성일(컴퓨터 시스템의 날짜와 시간을 자동으로 저장)

	public Memo() {

	}

	public Memo(String name, String password, String memoContent) {
		this.name = name;
		this.password = password;
		this.memoContent = memoContent;
	}

	public Memo(int number, String name, String password, String memoContent, LocalDateTime createdAt) {
		this.idx = number;
		this.name = name;
		this.password = password;
		this.memoContent = memoContent;
		this.createdAt = createdAt;
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

	public void setMemoContent(String memoContent) {
		this.memoContent = memoContent;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
