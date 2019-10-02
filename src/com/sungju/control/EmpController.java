package com.sungju.control;

import java.util.Scanner;

import com.sungju.emp.EmpDAO;
import com.sungju.input.EmpInput;
import com.sungju.view.EmpView;

public class EmpController {
	
	/**
	 * strat
	 * 1.사원전체정보출력
	 * 2.사원검색출력
	 * 3.종료
	 */
	
	
	private Scanner sn;
	
	public EmpController() {
		sn = new Scanner(System.in);
	}
	
	public void start() {
		boolean check = true;
		
		
		while (check) {
			
			System.out.println("1.전체정보출력");
			System.out.println("2.개별정보출력");
			System.out.println("3.사원정보추가");
			System.out.println("4.사원정보삭제");
			System.out.println("5.사원이름검색");
			System.out.println("6.종료");
			System.out.println("-------------");
			
			System.out.println("조회를 원하는 번호 입력");
			int ch = sn.nextInt();
			EmpDAO dao = new EmpDAO();
			EmpView view = new EmpView();
			EmpInput input = new EmpInput();
			
			switch (ch) {
			case 1:
				view.view(dao.getSelectList());
				break;
				
			case 2:
				view.view(dao.getSelectOne(input.empnoInput()));
				break;
			case 3:
				dao.EmpInsert(input.empInsert());
				break;
			case 4:
				dao.empDelete(input.empnoInput());
				break;
			case 5:
				view.view(dao.getSelectList(input.enameInput()));;
				break;
			case 6:
				System.out.println("종료합니다");
				check = !check;
				break;

			default:
				System.out.println("다시 입력하세요");
				break;
			}
			
			
			
		}
	}

}
