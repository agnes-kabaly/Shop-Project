package bolt;

import java.util.Date;

public class Tej {

	private long vonalKod;
	private final int LITER = 1000;
	private final int FELLITER = 500;
	private final int POHAR = 250;
	private final double ZSIROS = 3.5;
	private final double FELZSIROS = 2.8;
	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public long getVonalKod() {
		return vonalKod;
	}

	public boolean joMeg() {

		Date today = new Date();
		if (today.before(szavatossagiIdo)) {
			return true;
		}
		return false;
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public long getAr() {
		return ar;
	}

	public String toString() {
		return "Vonalkód: " + this.vonalKod + ", " + "Űrtartalom: " + this.urtartalom + ", " + "gyártó: " + this.gyarto
				+ ", " + "szavatossági idő: " + this.szavatossagiIdo + ", " + "zsirtartalom: " + this.zsirtartalom
				+ ", " + "ár: " + this.ar;
	}
}
