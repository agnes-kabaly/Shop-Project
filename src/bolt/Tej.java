package bolt;

import java.util.Date;

public class Tej {

	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;

	public Tej(int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		super();
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public boolean joMeg() {
		return false;
	}

	public int getUrtartalom() {
		return 0;
	}

	public String getGyarto() {
		return null;
	}

	public Date getSzavatossagiIdo() {
		return null;
	}

	public double getZsirtartalom() {
		return 0;
	}

	public int getAr() {
		return 0;
	}

	public String toStribg() {
		return null;
	}
}
