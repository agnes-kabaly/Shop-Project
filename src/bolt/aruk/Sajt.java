package bolt.aruk;

import java.util.Date;

public class Sajt extends Elelmiszer {

	protected double suly;
	protected double zsirtartalom;
	protected Long vonalKod;
	protected String gyarto;
	protected Date szavatossagiIdo;

	public Sajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
	}

	public double getSuly() {
		return suly;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public Long getVonalKod() {
		return vonalKod;
	}

	@Override
	public boolean joMeg() {

		Date today = new Date();
		if (today.before(szavatossagiIdo)) {
			return true;
		}
		return false;
	}

	@Override
	public String getGyarto() {
		return gyarto;
	}

	@Override
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	@Override
	public String toString() {
		return "Vonalkód: " + this.vonalKod + ", " + "gyártó: " + this.gyarto + ", " + "szavatossági idő: "
				+ this.szavatossagiIdo + ", " + "súly: " + this.suly + ", " + "zsírtartalom: " + this.zsirtartalom;
	}

}