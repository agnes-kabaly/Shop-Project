package bolt;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Tej[] tejpult;
	private int flag;

	public Bolt(String nev, String cim, String tulajdonos, Tej[] tejpult) {
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
		return false;
	}

	public Tej vasarolTej(Tej m) {
		return m;
	}

	public void feltoltTej(Tej m) {
	}

}
