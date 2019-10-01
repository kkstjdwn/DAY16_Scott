package com.sungju.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sungju.util.DBconnector;

public class EmpDAO {
	//data 넣거나 꺼내오기
	
	/**
	 * getSelectOne 사원번호 받아서 한명꺼내오기
	 */
	
	
	public EmpDTO getSelectOne(int empno) {
		EmpDTO emp = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			con = DBconnector.getConnect();
			String sql = "select empno,ename,job,mgr,hiredate,sal,nvl(comm,0) comm,deptno "
					+ "from emp "
					+ "where empno = ?";
			st = con.prepareStatement(sql);
			
			st.setInt(1, empno);
			
			rs = st.executeQuery();
			
			if (rs.next()) {
				emp = new EmpDTO();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setMgr(rs.getInt(4));
				emp.setHiredate(rs.getDate(5));
				emp.setSal(rs.getInt(6));
				emp.setComm(rs.getInt(7));
				emp.setDeptno(rs.getInt(8));
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return emp;
	}
	
	
	
	public ArrayList<EmpDTO> getSelectList() {
		ArrayList<EmpDTO> aremp = null;
		EmpDTO emp = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			con = DBconnector.getConnect();
			String sql = "select * from emp order by hiredate desc";
			st = con.prepareStatement(sql);
			
			
			rs = st.executeQuery();
			aremp = new ArrayList<EmpDTO>();
			
			while (rs.next()) {
				emp = new EmpDTO();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setMgr(rs.getInt(4));
				emp.setHiredate(rs.getDate(5));
				emp.setSal(rs.getInt(6));
				emp.setComm(rs.getInt(7));
				emp.setDeptno(rs.getInt(8));
				
				aremp.add(emp);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		
		return aremp;

}
}
