package com.col.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sungju.util.DBconnector;

public class BonusDAO {

	BonusDTO dto;
	ArrayList<BonusDTO> ar;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	int result;
	String sql;

	public BonusDAO() {
		dto = null;
		ar = null;
		result = 0;
		sql = null;
		con = null;
		st = null;
		rs = null;
	}

	public BonusDTO getSelectOne(String ename) {

		try {
			con = DBconnector.getConnect();
			sql = "select * from bonus " + "where ename = ?";
			st = con.prepareStatement(sql);
			st.setString(1, ename);
			rs = st.executeQuery();
			if (rs.next()) {
				dto = new BonusDTO();
				dto.setEname(rs.getString(1));
				dto.setJob(rs.getString(2));
				dto.setSal(rs.getInt(3));
				dto.setComm(rs.getInt(4));

			} else {
				System.out.println("일치하는 사원의 정보가 없습니다");
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

		return dto;

	}
	
	public List<BonusDTO> getSelectList() {
		ar = new ArrayList<BonusDTO>();
		
		try {
			con = DBconnector.getConnect();
			sql = "select * from bonus";
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			
			while (rs.next()) {
				dto = new BonusDTO();
				dto.setEname(rs.getString(1));
				dto.setJob(rs.getString(2));
				dto.setSal(rs.getInt(3));
				dto.setComm(rs.getInt(4));
				
				ar.add(dto);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ar;
		
		
	}
	
	
	public int boInsert(BonusDTO dto) {
		try {
			con = DBconnector.getConnect();
			sql = "insert into bonus(ename,job,sal,comm) values(?, ?, ?, ?)";
			st = con.prepareStatement(sql);
			st.setString(1, dto.getEname());
			st.setString(2, dto.getJob());
			st.setInt(3, dto.getSal());
			st.setInt(4, dto.getComm());
			
			result = st.executeUpdate();
			if (result != 0) {
				System.out.println("보너스 정보 추가 성공");
			} else {
				System.out.println("보너스 정보 추가 실패");
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
		
		return result;
	}
	
	public int boDelete(String ename) {
		try {
			con = DBconnector.getConnect();
			sql = "delete bonus "
					+ "where ename = ?";
			st = con.prepareStatement(sql);
			st.setString(1,ename);
			
			result = st.executeUpdate();
			
			if (result != 0) {
				System.out.println("보너스 정보 삭제 성공");
				
			}else {
				System.out.println("보너스 정보 삭제 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
