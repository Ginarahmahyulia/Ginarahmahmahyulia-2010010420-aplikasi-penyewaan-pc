package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    
    static Connection conn;
	public static Connection getConnection(){
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_pc", "root", "");
            } catch(Exception e) {
                System.out.println(e.toString());
            }
	return conn;
    }
}
