package model;

import java.sql.Date;

public class Travel {
	
	private int idTravel;
	private String Bolumu;
	private String Muduru;
	private String seyehat_Baslangis;
	private Date seyehat_Sonu;
	private Date seyehat_Yeri;
	private String gidis_Amaci;
	private String kod;	

	public Travel(int idTravel, String bolumu, String muduru, String seyehat_Baslangis, Date seyehat_Sonu,
			Date seyehat_Yeri, String gidis_Amaci, String kod) {
		super();
		this.idTravel = idTravel;
		Bolumu = bolumu;
		Muduru = muduru;
		this.seyehat_Baslangis = seyehat_Baslangis;
		this.seyehat_Sonu = seyehat_Sonu;
		this.seyehat_Yeri = seyehat_Yeri;
		this.gidis_Amaci = gidis_Amaci;
		this.kod = kod;
	}

	public int getIdTravel() {
		return idTravel;
	}

	public void setIdTravel(int idTravel) {
		this.idTravel = idTravel;
	}

	public String getBolumu() {
		return Bolumu;
	}
	public void setBolumu(String bolumu) {
		Bolumu = bolumu;
	}
	public String getMuduru() {
		return Muduru;
	}
	public void setMuduru(String muduru) {
		Muduru = muduru;
	}
	public String getSeyehat_Baslangis() {
		return seyehat_Baslangis;
	}
	public void setSeyehat_Baslangis(String seyehat_Baslangis) {
		this.seyehat_Baslangis = seyehat_Baslangis;
	}

	public Date getSeyehat_Sonu() {
		return seyehat_Sonu;
	}

	public void setSeyehat_Sonu(Date seyehat_Sonu) {
		this.seyehat_Sonu = seyehat_Sonu;
	}

	public Date getSeyehat_Yeri() {
		return seyehat_Yeri;
	}

	public void setSeyehat_Yeri(Date seyehat_Yeri) {
		this.seyehat_Yeri = seyehat_Yeri;
	}

	public String getGidis_Amaci() {
		return gidis_Amaci;
	}
	public void setGidis_Amaci(String gidis_Amaci) {
		this.gidis_Amaci = gidis_Amaci;
	}
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}	
}
