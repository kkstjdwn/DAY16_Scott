package com.col.view;

import java.util.ArrayList;

import com.col.bo.BonusDTO;

public class BonusView {

	public void selectList(ArrayList<BonusDTO> ar) {
		for(BonusDTO bonusDTO : ar) {
			this.SelectOne(bonusDTO);
		}
	}
	
	public void SelectOne(BonusDTO bonusDTO) {
		System.out.println("========================");
		System.out.println("ENAME : " + bonusDTO.getEname());
		System.out.println("JOB : " + bonusDTO.getJob());
		System.out.println("SAL : " + bonusDTO.getSal());
		System.out.println("COMM : " + bonusDTO.getComm());
	}
}