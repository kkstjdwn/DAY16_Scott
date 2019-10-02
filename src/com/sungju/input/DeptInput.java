package com.sungju.input;

import java.util.Scanner;

import com.sungju.dept.DeptDTO;

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
	
	public DeptDTO deptInsert() {
		DeptDTO dto = new DeptDTO();
		System.out.println("새로운 부서번호를 입력하세요");
		dto.setDeptno(sn.nextInt());
		System.out.println("추가할 부서의 이름을 입력하세요");
		dto.setDname(sn.next().toUpperCase());
		System.out.println("부서의 지역을 입력하세요");
		dto.setLoc(sn.next().toUpperCase());
		System.out.println();
		
		return dto;
	}


}
