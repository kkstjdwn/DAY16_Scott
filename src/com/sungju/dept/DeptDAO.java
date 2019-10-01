package com.sungju.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sungju.util.DBconnector;

public class DeptDAO {
	
	public DeptDTO selone(int deptno) {
		DeptDTO dto = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			con = DBconnector.getConnect();
			String sql = "select * from dept "
					+ "where deptno = ?";
			st = con.prepareStatement(sql);
			st.setInt(1, deptno);
			
			rs = st.executeQuery();
			
			if (rs.next()) {
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				
			}
			
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
	
	public ArrayList<DeptDTO> sellist() {
		ArrayList<DeptDTO> arde = new ArrayList<DeptDTO>();
		DeptDTO dto = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			con = DBconnector.getConnect();
			String sql = "select * from dept "
					+ "order by deptno asc";
			st = con.prepareStatement(sql);
			
			
			rs = st.executeQuery();
			
			while (rs.next()) {
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				
				arde.add(dto);
				
			}
			
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
		
		
		return arde;
	}

}
