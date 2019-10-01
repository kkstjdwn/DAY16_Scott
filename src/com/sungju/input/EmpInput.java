package com.sungju.input;

import java.util.Scanner;

import com.sungju.emp.EmpDAO;

public class EmpInput {
	private Scanner sn;
	
	public EmpInput() {
	this.sn = new Scanner(System.in);
	}
	
	public int empnoInput() {
		
		System.out.println("사원번호를 입력하세요");
		int empno = sn.nextInt();
		
		return empno;
	}

}
