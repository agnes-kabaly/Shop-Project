package bolt;

import java.util.Hashtable;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable elelmiszerpult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable elelmiszerpult) {
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

		// if (elelmiszerpult.size() > 0) {
		// return true;
		// }
		return false;
	}

	public boolean vanMegTej() {

		// if (elelmiszerpult.size() > 0) {
		// return true;
		// }
		return false;
	}

	public boolean vanMegSajt() {

		// if (elelmiszerpult.size() > 0) {
		// return true;
		// }
		return false;
	}

	public void feltoltElelmiszerrel(Long vonalKod, long mennyiseg) {

		// if (elelmiszerpult.containsKey(t)) {
		// elelmiszerpult.put(t, elelmiszerpult.get(t));
		// }
		// elelmiszerpult.put(t, 1);
	}

	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		// ujElelmiszer = ...?
	}

	public void torolElelmiszert(Long vonalKod) {
		elelmiszerpult.remove(vonalKod);
	}

	public void vasarolElelmiszert(Long vonalKod, long mennyiseg) {
		// vasarol?
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
