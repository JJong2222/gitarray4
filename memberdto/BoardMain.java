package org.project.memberdto;

import java.util.Date;

public class BoardMain {
	public static void main(String[] args) {

		BoardDto board = new BoardDto();

		board.setNo(1);
		board.setTitle("제목");
		board.setMemo("내용");
		board.setDay(new Date());

		int no = board.getNo();
		String title = board.getTilte();
		String memo = board.getMemo();
		Date day = board.getday();

		System.out.println("값 :" + no);
		System.out.println("제목 :" + title);
		System.out.println("내용 :" + memo);
		System.out.println("현재 :" + day);

		System.out.println(board.toString());
	}
}
