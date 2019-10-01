package com.sungju.view;

import java.util.ArrayList;

import com.sungju.dept.DeptDTO;

public class DeptView {
	
	public void view(DeptDTO dto) {
		if (dto != null) {
			System.out.println("DEPTNO\tDNAME\tLOC");
			System.out.println(dto.getDeptno()+"\t"+dto.getDname()+"\t"+dto.getLoc());
			
		}else {
			System.out.println("일치하는 정보가 없습니다.");
		}
		
	}
	
	public void view(ArrayList<DeptDTO> arde) {
		System.out.println("DEPTNO\tDNAME\tLOC");
		for (DeptDTO dto : arde) {
			System.out.println(dto.getDeptno()+"\t"+dto.getDname()+"\t"+dto.getLoc());
		}
	}

}
