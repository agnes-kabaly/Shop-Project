package bolt;

import java.util.Hashtable;

import bolt.aruk.Elelmiszer;
import bolt.aruk.Sajt;
import bolt.aruk.Tej;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, BoltBejegyzes> elelmiszerpult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, BoltBejegyzes> elelmiszerpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	public String getNev() {
		return nev;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}

	public String getCim() {
		return cim;
	}

	public boolean vanMegAdottAru(Class c) {

		for (BoltBejegyzes boltBejegyzes : elelmiszerpult.values()) {
			Elelmiszer elelmiszer = boltBejegyzes.getElelmiszer();
			if (elelmiszer.getClass().equals(c)) {
				return true;
			}
		}
		return false;
	}

	public boolean vanMegTej() {

		return vanMegAdottAru(Tej.class);
	}

	public boolean vanMegSajt() {

		return vanMegAdottAru(Sajt.class);
	}

	public void feltoltElelmiszerrel(Long vonalKod, long mennyiseg) {

		for (Long v : elelmiszerpult.keySet()) {
			if (v.equals(vonalKod)) {
				elelmiszerpult.get(v).adMennyiseg(mennyiseg);
			}
		}
	}

	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		BoltBejegyzes ujElelmiszer = new BoltBejegyzes(e, mennyiseg, ar);
		elelmiszerpult.put(e.getVonalKod(), ujElelmiszer);
	}

	public void torolElelmiszert(Long vonalKod) {
		elelmiszerpult.remove(vonalKod);
	}

	public void vasarolElelmiszert(Long vonalKod, long mennyiseg) {
		for (Long v : elelmiszerpult.keySet()) {
			if (v.equals(vonalKod)) {
				elelmiszerpult.get(v).levonMennyiseg(mennyiseg);
			}
		}
	}

	public class BoltBejegyzes {
		private Elelmiszer e;
		private long mennyiseg;
		private long ar;

		public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar) {
			this.e = e;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}

		public Elelmiszer getElelmiszer() {
			return e;
		}

		public void setElelmiszer(Elelmiszer e) {
			this.e = e;
		}

		public long getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(long mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public void adMennyiseg(long mennyiseg) {
			this.mennyiseg = this.mennyiseg + mennyiseg;
		}

		public void levonMennyiseg(long mennyiseg) {
			this.mennyiseg = this.mennyiseg - mennyiseg;
		}

		public long getAr() {
			return ar;
		}

		public void setAr(long ar) {
			this.ar = ar;
		}

	}
}
