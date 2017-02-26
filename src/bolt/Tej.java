package bolt;

import java.util.Date;

public class Tej {

	public final int LITER = 1000;
	public final int FELLITER = 500;
	public final int POHAR = 250;
	public final double ZSIROS = 3.5;
	public final double FELZSIROS = 2.8;

	protected long vonalKod;
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
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

	public String toString() {
		return "Vonalkód: " + this.vonalKod + ", " + "Űrtartalom: " + this.urtartalom + ", " + "gyártó: " + this.gyarto
				+ ", " + "szavatossági idő: " + this.szavatossagiIdo + ", " + "zsirtartalom: " + this.zsirtartalom;
	}
}
