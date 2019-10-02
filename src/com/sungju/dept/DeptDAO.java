package com.sungju.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sungju.util.DBconnector;

public class DeptDAO {

	private Connection con;
	private PreparedStatement st;
	private ResultSet rs;

	public DeptDAO() {
		con = null;
		st = null;
		rs = null;

	}

	public DeptDTO selone(int deptno) {
		DeptDTO dto = null;

		try {
			con = DBconnector.getConnect();
			String sql = "select * from dept " + "where deptno = ?";
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
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return dto;
	}

	public List<DeptDTO> selList() { // List가 ArrayList의 부모타입이니 리턴타입에 추가 해도 상관없음
		ArrayList<DeptDTO> arde = new ArrayList<DeptDTO>();
		DeptDTO dto = null;

		try {
			con = DBconnector.getConnect();
			String sql = "select * from dept " + "order by deptno asc";
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
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return arde;
	}

	public int deptInsert(DeptDTO dto) {
		int result = 0;
		// 매개변수로 받은 데이터를 추가
		try {
			con = DBconnector.getConnect();
			String sql = "insert into dept(deptno, dname, loc) values(?, ?, ?)";
			st = con.prepareStatement(sql);
			st.setInt(1, dto.getDeptno());
			st.setString(2, dto.getDname());
			st.setString(3, dto.getLoc());

			result = st.executeUpdate();
			if (result != 0) {
				System.out.println("부서 추가 성공");

			} else {
				System.out.println("부서 추가 실패");
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
		return result;

	}

}
