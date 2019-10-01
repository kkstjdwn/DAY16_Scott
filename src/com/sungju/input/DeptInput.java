package com.sungju.input;

import java.util.Scanner;

public class DeptInput {
	private Scanner sn;
	
	public DeptInput() {
	this.sn = new Scanner(System.in);
	}
	
	public int deptnoInput() {
		
		System.out.println("부서번호를 입력하세요");
		int deptno = sn.nextInt();
		
		return deptno;
	}


}
