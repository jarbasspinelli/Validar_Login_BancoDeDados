package Application;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Entities.Usuario;
import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		Usuario usuario = new Usuario("ADM@teste.com.br", 12345678);

		try {

			conn = (Connection) DB.getConnection();
			st = (Statement) conn.createStatement();
			rs = st.executeQuery("SELECT * from Login ");
			
			while(rs.next()) {

			if (usuario.getEmail() == String.format("", rs.getString("Email")) || usuario.getSenha() == rs.getInt("Senha")) {
				System.out.println("Usuario validado com sucesso!");
			} else {
				System.out.println("Usuario invalido, verifique dados digitados!");
			}
			}
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			DB.closerResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}  
	}

}
