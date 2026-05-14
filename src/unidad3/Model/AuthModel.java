package unidad3.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class AuthModel {

     public AuthModel() {
        
    }

     public boolean access(String username, String password){

        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";		
		Connection conn = null;

        try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/LADYGAGA", 
					"root", 
					"Corzo050204"

					
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
		    ps.setString(1, username);
		    ps.setString(2, password);
		    
		    ResultSet rs = ps.executeQuery();
		    
		    if (rs.next()) {
		    	 
		        return true;
		    }  
			
		    rs.close();
		    ps.close();
		    conn.close();
		    
			System.out.println(query);
			
			
		} catch (Exception e) { 
			e.printStackTrace();
		}

        return false;
    }


    
}
