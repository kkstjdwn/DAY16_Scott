package com.sungju.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sungju.util.DBconnector;

public class DeptDAO {
	
	public DeptDTO selone(int deptno) {
		DeptDTO dto = new DeptDTO();
		Connection con = null;
		PreparedStatement st = null;
		
		try {
			con = DBconnector.getConnect();
			st = con.prepareStatement(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return dto;
	}

}
