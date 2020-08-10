package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


public class ConnectionManager {
	
	//Ýlgili Sýnýfta Veritabanýna Baðlantý Ýþlemini Yaptýk 
	
	public DataSource getMySQLDataSource() {
		
		Properties probs = new Properties();
		
		InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");
		
		MysqlDataSource mySQLDataSource = null;
		
		try {
			probs.load(is);
			
			// Veritabanýna baðlandýk 
			mySQLDataSource = new MysqlDataSource();
			mySQLDataSource.setURL(probs.getProperty("url"));
			mySQLDataSource.setUser(probs.getProperty("username"));
			mySQLDataSource.setPassword(probs.getProperty("password"));						
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mySQLDataSource;
		
	}
	
}
