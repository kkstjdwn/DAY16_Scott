package com.sungju.hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sungju.util.DBconnector;
import com.sungju.util.DBconnectorForHR;

public class HrDAO {

	Connection con;
	PreparedStatement st;
	ResultSet rs;
	String sql;
	int result;
	HrDTO dto;
	ArrayList<HrDTO> ar;

	public HrDAO() {
		this.con = null;
		this.st = null;
		this.rs = null;
		this.sql = null;
		this.result = 0;
		this.dto = null;
		this.ar = null;

	}

	public HrDTO selone(int empId) {

		try {
			con = DBconnectorForHR.getConnect();
			sql = "select * from employees " + "where employee_id = ? ";
			st = con.prepareStatement(sql);
			st.setInt(1, empId);
			rs = st.executeQuery();

			if (rs.next()) {
				this.dto = new HrDTO();
				dto.setEmpId(rs.getInt(1));
				dto.setFirstName(rs.getString(2));
				dto.setLastName(rs.getString(3));
				dto.setEmail(rs.getString(4));
				dto.setPhoneNumber(rs.getString(5));
				dto.setHierdate(rs.getDate(6));
				dto.setJobId(rs.getString(7));
				dto.setSalary(rs.getInt(8));
				dto.setCommPct(rs.getDouble(9));
				dto.setManagerId(rs.getInt(10));
				dto.setDeptId(rs.getInt(11));

			} else {
				System.out.println("일치하는 EmpId가 없습니다");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return this.dto;
	}

	public ArrayList<HrDTO> selall() {

		try {
			this.ar = new ArrayList<HrDTO>();
			con = DBconnectorForHR.getConnect();
			sql = "select * from employees";
			st = con.prepareStatement(sql);
			
			rs = st.executeQuery();
			
			while (rs.next()) {
				this.dto = new HrDTO();
				dto.setEmpId(rs.getInt(1));
				dto.setFirstName(rs.getString(2));
				dto.setLastName(rs.getString(3));
				dto.setEmail(rs.getString(4));
				dto.setPhoneNumber(rs.getString(5));
				dto.setHierdate(rs.getDate(6));
				dto.setJobId(rs.getString(7));
				dto.setSalary(rs.getInt(8));
				dto.setCommPct(rs.getDouble(9));
				dto.setManagerId(rs.getInt(10));
				dto.setDeptId(rs.getInt(11));
				ar.add(dto);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			return ar;
		
	}
	
	
	
	public void hrInsert(HrDTO dto) {
		
		try {
			con = DBconnectorForHR.getConnect();
			sql = "insert into employees values(?,?,?,?,?,sysdate,?,?,?,?,?) ";
			st = con.prepareStatement(sql);
			st.setInt(1, dto.getEmpId());
			st.setString(2, dto.getFirstName());
			st.setString(3, dto.getLastName());
			st.setString(4, dto.getEmail());
			st.setString(5, dto.getPhoneNumber());
			st.setString(6, dto.getJobId());
			st.setInt(7, dto.getSalary());
			st.setDouble(8, dto.getCommPct());
			st.setInt(9, dto.getManagerId());
			st.setInt(10, dto.getDeptId());
			
			this.result = st.executeUpdate();
			
			if (result != 0) {
				
				System.out.println("정보 추가 성공");
				
			} else {
				
				System.out.println("정보 추가 실패");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	public void hrDelete(int empId) {
		
		try {
			con = DBconnectorForHR.getConnect();
			sql = "delete employees "
					+ "where employee_id = ?";
			st = con.prepareStatement(sql);
			
			st.setInt(1, empId);
			
			this.result = st.executeUpdate();
			if (result !=0) {
				System.out.println("정보 삭제 성공");
				
			}else {
				System.out.println("정보 삭제 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
