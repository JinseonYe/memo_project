package memo.entity;

import java.time.LocalDateTime;

public class Memo {
	int number; // 글 번호
	String name; // 작성자 이름
	String password; // 비밀번호
	String memo; // 게시글
	LocalDateTime createdAt; // 작성일(컴퓨터 시스템의 날짜와 시간을 자동으로 저장)

	public Memo() {

	}

	public Memo(int number, String name, String password, String memo, LocalDateTime createdAt) {
		this.number = number;
		this.name = name;
		this.password = password;
		this.memo = memo;
		this.createdAt = createdAt;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
