package io;

public class Filtry {

	private boolean PoDacie;
	private String data;
	private boolean PoCenie;
	private int cenaMin;
	private int cenaMax;
	private boolean poRegionie;
	private boolean region;
	private boolean poKlasie;
	private int klasa;

	public boolean getPoDacie()                                         {	return PoDacie;}
	public void setPoDacie(boolean PoDacie)                                { this.PoDacie = this.PoDacie;	}
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
	public boolean getRegion()                                          {	return region; }
	public void setRegion(boolean region)                                  {	this.region = region;}
	public boolean getPoKlasie()                                        {	return poKlasie; }
	public void setPoKlasie(boolean poKlasie)                              {	this.poKlasie = poKlasie;}
	public int getKlasa()                                               {	return klasa; }
	public void setKlasa(int klasa) {}
}