package bolt;

import java.util.Date;

import bolt.aruk.Sajt;
import bolt.aruk.Szappan;
import bolt.aruk.Tej;
import bolt.aruk.tej.TartosTej;

public abstract class BoltFactory {

	public Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, long ar) {
		Tej tartos = new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, ar);
		return tartos;
	}

	public Tej ujFeliratosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, long ar) {
		Tej feliratos = new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, ar);
		return feliratos;
	}

	public Sajt ujSajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		Sajt sajt = new Sajt(vonalKod, suly, gyarto, szavatossagiIdo, zsirtartalom);
		return sajt;
	}

	public Szappan ujSzappan(Long vonalKod, String gyarto, char mosogatas) {
		Szappan szappan = new Szappan(vonalKod, gyarto, mosogatas);
		return szappan;
	}
}
