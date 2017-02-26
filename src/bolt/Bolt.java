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

	// public Tej vasarolTej(long vonalKod) {
	public Tej vasarolTej(Tej m) {
		return m;
	}

	public void feltoltTej(Tej m) {

		if (tejpult.containsKey(m)) {
			tejpult.put(m, tejpult.get(m));
		}
		tejpult.put(m, 1);
	}

}
