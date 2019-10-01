package com.sungju.view;

import java.util.ArrayList;

import com.sungju.emp.EmpDTO;

public class EmpView {
	// emp 출력

	/**
	 * empdao 에서 꺼내온 한명 출력
	 */

	public void view(EmpDTO emp) {
		if (emp != null) {
			System.out.println("EMPNO		: " + emp.getEmpno());
			System.out.println("ENAME		: " + emp.getEname());
			System.out.println("JOB		: " + emp.getJob());
			System.out.println("MGR		: " + emp.getMgr());
			System.out.println("HIREDATE	: " + emp.getHiredate());
			System.out.println("SAL		: " + emp.getSal());
			System.out.println("COMM		: " + emp.getComm());
			System.out.println("DEPTNO		: " + emp.getDeptno());

//			System.out.println("EMPNO\tENAME\tJOB\tMGR\tHIREDATE\tSAL\tCOMM\tDEPTNO");
//			System.out.println(emp.getEmpno()+"\t"+emp.getEname()+"\t"+emp.getJob()+"\t"+emp.getMgr()+"\t"+emp.getHiredate()+"\t"+emp.getSal()+"\t"+emp.getComm()+"\t"+emp.getDeptno());
		} else {
			System.out.println("일치하는 DATA가 없습니다");
		}
		System.out.println();
	}

	public void view(ArrayList<EmpDTO> aremp) {
		if (aremp.size() != 0) {
			System.out.println("EMPNO\tENAME\tJOB\tMGR\tHIREDATE\tSAL\tCOMM\tDEPTNO");
			for (int i = 0; i < aremp.size(); i++) {

				System.out.println(aremp.get(i).getEmpno() + "\t" + aremp.get(i).getEname() + "\t"
						+ aremp.get(i).getJob() + "\t" + aremp.get(i).getMgr() + "\t" + aremp.get(i).getHiredate()
						+ "\t" + aremp.get(i).getSal() + "\t" + aremp.get(i).getComm() + "\t"
						+ aremp.get(i).getDeptno());
			}
		} else {
			System.out.println("일치하는 DATA가 없습니다");
		}
		System.out.println();
	}

}
