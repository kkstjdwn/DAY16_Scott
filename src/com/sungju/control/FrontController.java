package com.sungju.control;

import java.util.Scanner;

public class FrontController {
	
	private EmpController empController;
	private DeptController deptController;
	private Scanner sc;
	
	public FrontController() {
	 empController = new EmpController();
	 deptController = new DeptController();
	 sc = new Scanner(System.in);
	}
	
	public void start() {
		
		boolean check = true;
		int select = 0;
		
		while (check) {
			System.out.println("1. 사원 관리");
			System.out.println("2. 부서 관리");
			System.out.println("3. 종	료");
			select = sc.nextInt();
			
			switch (select) {
			case 1 :
				empController.start();
				
				break;
			case 2 :
				deptController.Start();
				break;
			case 3 :
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
