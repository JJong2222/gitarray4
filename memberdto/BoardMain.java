package org.project.memberdto;

import java.util.Date;

public class BoardMain {
	public static void main(String[] args) {

		BoardDto board = new BoardDto();

		board.setNo(1);
		board.setTitle("����");
		board.setMemo("����");
		board.setDay(new Date());

		int no = board.getNo();
		String title = board.getTilte();
		String memo = board.getMemo();
		Date day = board.getday();

		System.out.println("�� :" + no);
		System.out.println("���� :" + title);
		System.out.println("���� :" + memo);
		System.out.println("���� :" + day);

		System.out.println(board.toString());
	}
}
