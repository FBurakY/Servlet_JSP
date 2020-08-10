package dao;

import java.util.List;


import model.Travel;

public interface TravelDAO {
	
	public List<Travel> getTravel();
	
	public void removeTravel(int id);	

}
