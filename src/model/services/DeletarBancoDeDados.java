package model.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import db.DB;

public class DeletarBancoDeDados {
	
	public void DeletarDados() {
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = (Connection) DB.getConnection();
			st = (PreparedStatement) conn.prepareStatement("DELETE FROM login " + "WHERE " + "id = ?");
			
			st.setInt(1, 2);
			
			System.out.println(st.executeUpdate());
			
		}catch (SQLException e){
			e.getStackTrace();
		}finally {
			DB.closerResultSet(rs);
			DB.closeConnection();
		}
	}

}
