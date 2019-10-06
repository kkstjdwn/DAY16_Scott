package com.sungju.hr;

import java.util.Scanner;

public class HrInput {

	Scanner sc;
	HrDTO dto;
	SelectHrJob job;

	public HrInput() {
		sc = new Scanner(System.in);
		dto = null;
		job = new SelectHrJob();
	}
	
	public int selone() {
		
		System.out.println("EmpId를 입력하세요");
		int id = sc.nextInt();
		
		return id;
	}
	
	public HrDTO Hrinselt() {
		dto = new HrDTO();
		System.out.println("employee_id를 입력하세요(207~)".toUpperCase());
		dto.setEmpId(sc.nextInt());
		System.out.println("first_name를 입력하세요".toUpperCase());
		dto.setFirstName(sc.next());
		System.out.println("last_name를 입력하세요".toUpperCase());
		dto.setLastName(sc.next());
		System.out.println("email를 입력하세요".toUpperCase());
		dto.setEmail(sc.next());
		System.out.println("phone_number를 입력하세요".toUpperCase());
		dto.setPhoneNumber(sc.next());
		System.out.println("job_id를 입력하세요".toUpperCase());
		dto.setJobId(job.selJob());
		System.out.println("salary를 입력하세요".toUpperCase());
		dto.setSalary(sc.nextInt());
		System.out.println("commission_pct를 입력하세요".toUpperCase());
		dto.setCommPct(sc.nextDouble());
		System.out.println("manager_id를 입력하세요".toUpperCase());
		System.out.println("100/101/102/103/108/114/120/121/122");
		System.out.println("123/124/145/146/147/148/149/201/205");
		dto.setManagerId(sc.nextInt());
		System.out.println("department_id를 입력하세요 (10~110)".toUpperCase());
		dto.setDeptId(sc.nextInt());
		System.out.println("-------입력완료-------");
		
		return dto;
		
	}

}
