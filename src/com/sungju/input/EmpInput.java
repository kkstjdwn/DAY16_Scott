package com.sungju.input;

import java.util.Scanner;

import com.sungju.emp.EmpDTO;

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
	
	public String enameInput() {
		System.out.println("사원의 이름을 입력하세요");
		String ename = sn.next();
		return ename.toUpperCase();
	}
	
	
	public EmpDTO empInsert() {
		EmpDTO dto = new EmpDTO();
		System.out.println("추가할 사원번호를 입력하세요");
		dto.setEmpno(sn.nextInt());
		System.out.println("사원의 이름을 입력하세요");
		dto.setEname(sn.next());
		System.out.println("사원의 직책을 입력하세요");
		System.out.println("salesman/president/manager/clerk/analyst".toUpperCase());
		dto.setJob(sn.next());
		System.out.println("사원의 매니저번호를 입력하세요");
		System.out.println("7902/7839/7782/7698/7698/7566");
		dto.setMgr(sn.nextInt());
		System.out.println("사원의 급여를 입력하세요");
		dto.setSal(sn.nextInt());
		System.out.println("사원의 COMM 입력하세요");
		dto.setComm(sn.nextInt());
		System.out.println("사원의 부서번호를 입력하세요");
		dto.setDeptno(sn.nextInt());
		System.out.println("입력 종료");
		
		
		return dto;
	}

}
