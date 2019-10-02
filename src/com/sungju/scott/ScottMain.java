package com.sungju.scott;

import com.sungju.control.FrontController;

public class ScottMain {

	public static void main(String args[]) {

//		EmpController controller = new EmpController();
//		controller.start();
//		DeptController controller = new DeptController();
//		controller.Start();
		FrontController controller = new FrontController();
		controller.start();
		
//		System.out.println("insert into emp(empno, ename, job, mgr, hiredate, sal, nvl(comm,0) comm, deptno) "
//					+ "values(?,?,?,?,sysdate,?,?,?)");

	}

}
