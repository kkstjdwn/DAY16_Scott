package com.sungju.view;

import java.util.List;
import com.sungju.dept.DeptDTO;

public class DeptView {
	
	public void view(DeptDTO dto) {
		if (dto != null) {
			System.out.println("DEPTNO\tDNAME\tLOC");
			System.out.println(dto.getDeptno()+"\t"+dto.getDname()+"\t"+dto.getLoc());
			
		}else {
			System.out.println("일치하는 정보가 없습니다");
		}
		
		System.out.println();
		
	}
	
	public void view(List<DeptDTO> arde) {
		if (arde.size() != 0) {			
			System.out.println("DEPTNO\tDNAME\tLOC");
			for (DeptDTO dto : arde) {
				System.out.println(dto.getDeptno()+"\t"+dto.getDname()+"\t"+dto.getLoc());
			}
		} else {
			System.out.println("저장된 정보가 없습니다");
		}
		System.out.println();
	}

}
