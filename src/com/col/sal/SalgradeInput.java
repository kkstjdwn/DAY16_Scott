package com.col.sal;

import java.util.Scanner;

public class SalgradeInput {
	
	private Scanner sc;
	
	public SalgradeInput() {
		sc = new Scanner(System.in);
	
	}
	
	public int selectOne() {
		System.out.println("급여등급을 입력하세요");
		int salgrade = sc.nextInt();
		
		return salgrade;
	}
	
	public SalgradeDTO salInsert() {
		SalgradeDTO dto = new SalgradeDTO();
		System.out.println("새로운 급여 등급을 입력하세요(5이상)");
		dto.setGrade(sc.nextInt());
		System.out.println("최저급여를 입력하세요");
		dto.setLosal(sc.nextInt());
		System.out.println("최고급여를 입력하세요");
		dto.setHisal(sc.nextInt());
		System.out.println();
		
		
		
		return dto;
	}

}
