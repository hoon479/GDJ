package com.gdu.contact.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gdu.contact.domain.ContactDTO;

public class ContactDAO {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "TIGER");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	private void close() {
		try {
			if(rs != null) { rs.close(); }
			if(ps != null) { ps.close(); }
			if(con != null) { con.close(); }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<ContactDTO> selectAllContacts() {
		List<ContactDTO> contacts = new ArrayList<ContactDTO>();
		try {
			con = getConnection();
			sql = "SELECT NO, NAME, TEL, ADDR, EMAIL, NOTE FROM CONTACT ORDER BY NO DESC";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				ContactDTO contact = new ContactDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				contacts.add(contact);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return contacts;
	}
	
	public ContactDTO selectContactByNo(int no) {
		ContactDTO contact = null;
		try {
			con = getConnection();
			sql = "SELECT NO, NAME, TEL, ADDR, EMAIL, NOTE FROM CONTACT WHERE NO=?"; 
		    ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			if(rs.next()) {
				contact = new ContactDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return contact;
	}
	
	public int insertContact(ContactDTO contact) {
		int result = 0;
		try {
			con = getConnection();
			sql = "INSERT INTO BOARD(NO, NAME, TEL, ADDR, EMAIL, NOTE)"
				+ "VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?, TO_CHAR(SYSDATE, 'YYYY-MM-DD'), TO_CHAR(SYSDATE, 'YYYY-MM-DD'))";
			ps = con.prepareStatement(sql);
			ps.setInt(1, contact.getNo());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getTel());
			result = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
	
	public int updateContact(ContactDTO contact) {
		int result = 0;
		try {
			con = getConnection();
			sql = "UPDATE CONTACT "
					+ "SET NO = ?, NAME = ?, ADDR = ?"
				    + "WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, contact.getNo());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getAddr());
			result = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
	
	public int deleteContact(int no) {
		int result = 0;
		try {
			con = getConnection();
			sql = "DELETE FROM CONTACT "
					+ "WHERE NO= ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			result = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
}
