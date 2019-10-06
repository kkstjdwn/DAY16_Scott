package com.sungju.hr;

import java.util.Scanner;

public class SelectHrJob {
	Scanner sc;
	public SelectHrJob() {
		sc = new Scanner(System.in);
	}
	
	public String selJob( ) {
		String job = null;
		System.out.println("1.AD_PRES");
		System.out.println("2.AD_VP");
		System.out.println("3.AD_ASST");
		System.out.println("4.FI_MGR");
		System.out.println("5.FI_ACCOUNT");
		System.out.println("6.AC_MGR");
		System.out.println("7.AC_ACCOUNT");
		System.out.println("8.SA_MAN");
		System.out.println("9.SA_REP");
		System.out.println("10.PU_MAN");
		System.out.println("11.PU_CLERK");
		System.out.println("12.ST_MAN");
		System.out.println("13.ST_CLERK");
		System.out.println("14.CH_CLERK");
		System.out.println("15.IT_PROG");
		System.out.println("16.MK_MAN");
		System.out.println("17.MK_REP");
		System.out.println("18.HR_REP");
		System.out.println("19.PR_REP");
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			job = "AD_PRES";
			break;
		case 2:
			job = "AD_VP";
			break;
		case 3:
			job = "AD_ASST";
			break;
		case 4:
			job = "FI_MGR";
		case 5:
			job = "FI_ACCOUNT";
			break;
		case 6:
			job = "AC_MGR";
			break;
		case 7:
			job = "AC_ACCOUNT";
			break;
		case 8:
			job = "SA_MAN";
			break;
		case 9:
			job = "SA_REP";
			break;
		case 10:
			job = "PU_MAN";
			break;
		case 11:
			job = "PU_CLERK";
			break;
		case 12:
			job = "ST_MAN";
			break;
		case 13:
			job = "ST_CLERK";
			break;
		case 14:
			job = "CH_CLERK";
			break;
		case 15:
			job = "IT_PROG";
			break;
		case 16:
			job = "MK_MAN";
			break;
		case 17:
			job = "MK_REP";
			break;
		case 18:
			job = "HR_REP";
			break;
		case 19:
			job = "PR_REP";
			break;


		default:
			break;
		}
		
		
		
		
		
		
		
		return job;
	}

}
