package com.col.bo;

import java.util.Scanner;

import com.col.view.BonusView;

public class BonusController {
	private Scanner sc;
	private BonusDAO dao;
	private BonusView view;
	private BonusInput input;
	
	
	public BonusController() {
	sc = new Scanner(System.in);
	dao = new BonusDAO();
	view = new BonusView();
	input = new BonusInput();
	}
	
	public void start() {
		boolean check = true;
		
		while (check) {
			System.out.println("===========");
			System.out.println("1.전체정보조회");
			System.out.println("2.개별정보조회");
			System.out.println("3.개별정보추가");
			System.out.println("4.개별정보삭제");
			System.out.println("5.종	료");
			System.out.println("조회할 정보의 번호를 입력하세요");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				view.selectList(dao.getSelectList());
				break;
				
			case 2:
				
				view.SelectOne(dao.getSelectOne(input.selectOne()));
				break;
			case 3:
				dao.boInsert(input.boInsert());
				break;
			case 4:
				dao.boDelete(input.selectOne());
				
				break;
			case 5:
				check = !check;
				break;

			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
		
		
	}
	
	

}
