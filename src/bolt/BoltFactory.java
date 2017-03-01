package bolt;

import java.util.Date;

import bolt.aruk.Sajt;
import bolt.aruk.Szappan;
import bolt.aruk.Tej;
import bolt.aruk.tej.FeliratosTej;
import bolt.aruk.tej.TartosTej;

public abstract class BoltFactory {

	public Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		Tej tartos = new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
		return tartos;
	}

	public Tej ujFeliratosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		Tej feliratos = new FeliratosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
		return feliratos;
	}

	public Tej ujFelzsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}

	public Tej ujZsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}

	public Tej ujFelzsirosFeliratosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new FeliratosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}

	public Tej ujZsirosFeliratosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new FeliratosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);

	}

	public Tej ujFelzsirosLiteresTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}

	public Tej ujZsirosFeliratosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}

	public Tej ujFelzsirosLiteresFeliratosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new FeliratosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}

	public Tej ujZsirosLiteresFeliratosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom) {
		return new FeliratosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}

	public Sajt ujSajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		Sajt sajt = new Sajt(vonalKod, suly, gyarto, szavatossagiIdo, zsirtartalom);
		return sajt;
	}

	public Szappan ujSzappan(Long vonalKod, String gyarto, char mosohatas) {
		Szappan szappan = new Szappan(vonalKod, gyarto, mosohatas);
		return szappan;
	}

	public Szappan ujAMosohatasuSzappan(Long vonalKod, String gyarto, char mosohatas) {
		return new Szappan(vonalKod, gyarto, mosohatas);
	}
}
