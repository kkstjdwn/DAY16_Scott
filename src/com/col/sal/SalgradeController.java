package com.col.sal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.col.view.SalgradeView;

public class SalgradeController {

	private Scanner sc;

	public SalgradeController() {
		sc = new Scanner(System.in);
	}

	public void start() {
		boolean check = true;
		while (check) {
			
			System.out.println("1. 전체정보출력");	
			System.out.println("2. 등  급  검  색");
			System.out.println("3. 등급정보출력");
			System.out.println("4. 등  급  삭  제");
			System.out.println("5. 종            료");
			int select = sc.nextInt();
			
			SalgradeDTO salgradeDTO = new SalgradeDTO();
			SalgradeDAO salgradeDAO = new SalgradeDAO();
			SalgradeInput salgradeInput = new SalgradeInput();
			SalgradeView salgradeView = new SalgradeView();
			ArrayList<SalgradeDTO> ar = new ArrayList<SalgradeDTO>();
			
			switch (select) {
			case 1 :
				ar = salgradeDAO.getSelectList();
				salgradeView.getSelectList(ar);
				break;
			case 2 :
				salgradeDTO = salgradeDAO.getSelectOne(salgradeInput.selectOne());
				
				salgradeView.getSelectOne(salgradeDTO);
				break;
			case 3 :
				salgradeDTO = salgradeInput.salInsert();
				select = salgradeDAO.salInsert(salgradeDTO);
				String s = "Insert Fail";
				if(select>0) {
					s = "Insert Seccess";
				}
				break;
			case 4 :
				
				select = salgradeDAO.salDelete(salgradeInput.selectOne());
				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				check = !check;
				break;
			default:
				System.out.println("다시누르세요");
				break;
			}
		}


	}

}