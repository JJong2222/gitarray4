package org.project.memberdto;

import java.util.Date;

public class BoardDto {
	private int no;
	private String title;
	private String memo;
	private Date day;

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTilte() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getday() {
		return this.day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "°ª [no=" + no + ", title=" + title + ", memo=" + memo + ", day=" + day + "]";
	}

}
