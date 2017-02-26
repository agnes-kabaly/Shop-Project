package bolt;

import java.util.Date;

public class Sajt extends Elelmiszer {

	public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		super(vonalKod, gyarto, szavatossagiIdo);
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
				+ this.szavatossagiIdo;
	}

}
