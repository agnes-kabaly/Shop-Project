package bolt;

import java.util.Hashtable;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable tejpult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable tejpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return cim;
	}

	public boolean vanMegTej() {

		if (tejpult.size() > 0) {
			return true;
		}
		return false;
	}

	public void feltoltTej(Tej t) {

		if (tejpult.containsKey(t)) {
			tejpult.put(t, tejpult.get(t));
		}
		tejpult.put(t, 1);
	}

	// public Tej vasarolTej(long vonalKod) {
	public Tej vasarolTej(Tej m) {
		return m;
	}

	public class BoltBejegyzes {
		private Tej t;
		private int mennyiseg;
		private int ar;

		public BoltBejegyzes(Tej t, int mennyiseg, int ar) {
			this.t = t;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}

		public Tej getT() {
			return t;
		}

		public void setT(Tej t) {
			this.t = t;
		}

		public int getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(int mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public void adMennyiseg(int mennyiseg) {
			this.mennyiseg = this.mennyiseg + mennyiseg;
		}

		public void levonMennyiseg(int mennyiseg) {
			this.mennyiseg = this.mennyiseg - mennyiseg;
		}

		public int getAr() {
			return ar;
		}

		public void setAr(int ar) {
			this.ar = ar;
		}

	}
}
