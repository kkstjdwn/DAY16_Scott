package com.sungju.hr;

import java.util.ArrayList;

public class View {
	
	
	
	public void view(HrDTO dto) {
		if (dto != null) {			
			
			System.out.println("employee_id    : ".toUpperCase() + dto.getEmpId());
			System.out.println("first_name     : ".toUpperCase() + dto.getFirstName());
			System.out.println("last_name      : ".toUpperCase() + dto.getLastName());
			System.out.println("email          : ".toUpperCase() + dto.getEmail());
			System.out.println("phone_number   : ".toUpperCase() + dto.getPhoneNumber());
			System.out.println("hire_date      : ".toUpperCase() + dto.getHierdate());
			System.out.println("job_id         : ".toUpperCase() + dto.getJobId());
			System.out.println("salary         : ".toUpperCase() + dto.getSalary());
			System.out.println("commission_pct : ".toUpperCase() + dto.getCommPct());
			System.out.println("manager_id     : ".toUpperCase() + dto.getManagerId());
			System.out.println("department_id  : ".toUpperCase() + dto.getDeptId());
			System.out.println("-------------------------------");
		}else {
			System.out.println("-------------------------------");
		}
		
		
	}
	
	public void view(ArrayList<HrDTO> ar) {
		if (ar.size() != 0) {
			
			for (HrDTO hrDTO : ar) {
				this.view(hrDTO);
			}
			
		}
	}

}
