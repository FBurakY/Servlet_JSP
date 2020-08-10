package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import model.Travel;

public class TravelDAOImpl implements TravelDAO {
	
	
	private static final String ALL_TRAVELL= "select * from travel";
	private static final String DELETE_TRAVELL ="delete from travel where id=?";
	
	
	private DataSource getDataSource() {
		
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();		
		return dataSource;
		
	}
	
	@Override
	public List<Travel> getTravel() {
		
		DataSource dataSource = getDataSource();
		Connection connection;
		List<Travel> traveLs = new ArrayList<Travel>();
		
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(ALL_TRAVELL);
			ResultSet resultSet = ps.executeQuery();
			
			// Travel Tablosundaki verileri çekiyoruz 
			while(resultSet.next()){
				int idTravel = resultSet.getInt("idtravel");
				String bolumu = resultSet.getString("bolumu");
				String muduru = resultSet.getString("muduru");
				
				String seyehatbaslangic = resultSet.getString("seyehat baslangic");
				Date seyehatsonu = resultSet.getDate("seyehatsonu");
				Date seyehatyeri = resultSet.getDate("seyehatyeri");
				
				String gidisamaci = resultSet.getString("gidisamaci");
				String kod = resultSet.getString("kod");
				
				Travel travels = new Travel(idTravel, bolumu, muduru, seyehatbaslangic, seyehatsonu, seyehatyeri, gidisamaci, kod);
				traveLs.add(travels);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return traveLs;
	}

	@Override
	public void removeTravel(int id) {
		
		DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETE_TRAVELL);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
