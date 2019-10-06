package com.sungju.hr;

import java.util.Scanner;

public class HrController {
	
	Scanner sc;
	HrDAO dao;
	HrInput input;
	View view;
	
	public HrController() {
		sc = new Scanner(System.in);
		dao = new HrDAO();
		input = new HrInput();
		view = new View();
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
				view.view(dao.selall());
				break;
				
			case 2:
				
				view.view(dao.selone(input.selone()));
				break;
			case 3:
				dao.hrInsert(input.Hrinselt());
				break;
			case 4:
				dao.hrDelete(input.selone());
				
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
