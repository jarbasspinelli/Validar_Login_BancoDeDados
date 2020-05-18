package Application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Entities.Usuario;
import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o E-mail: ");
		String Email = sc.next();
		System.out.println("Digite sua Senha: ");
		int Senha = sc.nextInt();

		Usuario usuario = new Usuario(Email, Senha);

		try {

			conn = (Connection) DB.getConnection();
			st = (Statement) conn.createStatement();
			rs = st.executeQuery("SELECT * from Login ");
			
			while(rs.next()) {

			if (usuario.getEmail().equals(rs.getString("Email")) && usuario.getSenha() == rs.getInt("Senha")) {
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
