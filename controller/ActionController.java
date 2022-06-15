package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

public class ActionController {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			System.out.println("쿼리문을 입력 하세요(insert,select,update,delete)");
			String op = scn.next();
			if (op.equals("insert")) {
				ActionInsert insert=new ActionInsert();
				insert.excuteQuery();
			} else if (op.equals("select")) {
				ActionSelect select=new ActionSelect();
				select.excuteQuery();
			} else if (op.equals("delete")) {
				ActionDelete delete=new ActionDelete();
				delete.excuteQuery();
			} else if (op.equals("update")) {
				ActionUpdate upd=new ActionUpdate();
				upd.excuteQuery();
			} else if (op.equals("exit")) {
				System.out.println("종료 합니다");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}

		}
	}
}
