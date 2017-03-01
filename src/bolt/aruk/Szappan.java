package bolt.aruk;

import bolt.Aru;

public class Szappan extends Aru {

	protected Long vonalKod;
	protected String gyarto;
	protected char mosogatas;

	public Szappan(Long vonalKod, String gyarto, char mosogatas) {
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.mosogatas = mosogatas;
	}

}
