package io;

public class Filtry {

	protected boolean PoDacie;
	protected String data;
	protected boolean PoCenie;
	protected int cenaMin;
	protected int cenaMax;
	protected boolean poRegionie;
	protected String region;
	protected boolean poKlasie;
	protected int klasa;

	public boolean getPoDacie()                                         {	return PoDacie;}
	public void setPoDacie(boolean PoDacie)                                { this.PoDacie = PoDacie;	}
	public String getData()                                             {return data; 	}
	public void setData(String data)                                    {	this.data = data;}
	public boolean getPoCenie()                                         {	return PoCenie; }
	public void setPoCenie(boolean PoCenie)                                {	this.PoCenie = PoCenie;}
	public int getCenaMin()                                             {	return cenaMin;}
	public void setCenaMin(int cenaMin)                                 {	this.cenaMin = cenaMin; }
	public int getCenaMax()                                             {	return cenaMax; }
	public void setCenaMax(int cenaMax)                                 {	this.cenaMax = cenaMax; }
	public boolean getPoRegionie()                                      {	return poRegionie; }
	public void setPoRegionie(boolean poRegionie)                          {	this.poRegionie = poRegionie;}
	public String getRegion()                                          {	return region; }
	public void setRegion(String region)                                  {	this.region = region;}
	public boolean getPoKlasie()                                        {	return poKlasie; }
	public void setPoKlasie(boolean poKlasie)                              {	this.poKlasie = poKlasie;}
	public int getKlasa()                                               {	return klasa; }
	public void setKlasa(int klasa) {this.klasa = klasa;}
}