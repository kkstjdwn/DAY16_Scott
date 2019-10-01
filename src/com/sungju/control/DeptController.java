package com.sungju.control;

import java.util.Scanner;

import com.sungju.dept.DeptDAO;
import com.sungju.emp.EmpDAO;
import com.sungju.input.DeptInput;
import com.sungju.input.EmpInput;
import com.sungju.view.DeptView;
import com.sungju.view.EmpView;

public class DeptController {
	
	private Scanner sn;
	
	public DeptController() {
	 sn = new Scanner(System.in);
	}
	
	public void Start() {
		boolean check = true;
		
		while (check) {

			System.out.println("1.전체정보출력");
			System.out.println("2.개별정보출력");
			System.out.println("3.종료");
			System.out.println("-------------");
			
			System.out.println("조회를 원하는 번호 입력");
			DeptDAO dao = new DeptDAO();
			DeptView view = new DeptView();
			DeptInput input = new DeptInput();
			int ch = sn.nextInt();
			
			
			switch (ch) {
			case 1:
				view.view(dao.sellist());
			
				break;
				
			case 2:
				view.view(dao.selone(input.deptnoInput()));
			
				break;
				
			case 3:
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
