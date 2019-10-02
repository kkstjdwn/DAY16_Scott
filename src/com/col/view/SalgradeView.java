package com.col.view;

import java.util.ArrayList;

import com.col.sal.SalgradeDTO;

public class SalgradeView {
	
	public void getSelectOne(SalgradeDTO dto) {
		if (dto != null) {
			System.out.println("GRADE\tLOSAL\tHISAL");
			System.out.println(dto.getGrade()+"\t"+dto.getLosal()+"\t"+dto.getHisal());
			
		} else {
			
			System.out.println("일치하는 정보가 없습니다.");
		}
		System.out.println();
		
	}
	
	
	public void getSelectList(ArrayList<SalgradeDTO> ar) {
		if (ar.size()!=0) {
			System.out.println("GRADE\tLOSAL\tHISAL");
			for (SalgradeDTO dto : ar) {
				System.out.println(dto.getGrade()+"\t"+dto.getLosal()+"\t"+dto.getHisal());
			}
			
		}else {
			System.out.println("저장된 정보가 없습니다.");
		}
		System.out.println();
		
		
	}

}
