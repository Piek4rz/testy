package io.bilet_package;

public class Lot {

	private String miejsce_wylotu;
	private String miejsce_lądowania;
	private String data;

	public Lot(String skad, String dokad, String kiedy){
		miejsce_wylotu = skad;
		miejsce_lądowania = dokad;
		data = kiedy;
	}

	public String getData() {
		return data;
	}

	public String getMiejsceWylotu(){
		return miejsce_wylotu;
	}

	String wypisz() {
		return miejsce_wylotu + " " + miejsce_lądowania + " " + data;
	}

}