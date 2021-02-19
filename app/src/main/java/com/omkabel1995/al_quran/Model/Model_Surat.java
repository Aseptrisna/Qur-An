package com.omkabel1995.al_quran.Model;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

//@Generated("com.robohorse.robopojogenerator")
public class Model_Surat implements Serializable {

	@SerializedName("nomor")
	private String nomor;

	@SerializedName("nama")
	private String nama;

	@SerializedName("asma")
	private String asma;

	@SerializedName("name")
	private String name;

	@SerializedName("start")
	private String start;

	@SerializedName("ayat")
	private String ayat;

	@SerializedName("type")
	private String type;

	@SerializedName("urut")
	private String urut;

	@SerializedName("rukuk")
	private String rukuk;

	@SerializedName("arti")
	private String arti;

	@SerializedName("keterangan")
	private String keterangan;

	public void setNomor(String nomor){
		this.nomor = nomor;
	}

	public String getNomor(){
		return nomor;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setAsma(String asma){
		this.asma = asma;
	}

	public String getAsma(){
		return asma;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setStart(String start){
		this.start = start;
	}

	public String getStart(){
		return start;
	}

	public void setAyat(String ayat){
		this.ayat = ayat;
	}

	public String getAyat(){
		return ayat;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrut(String urut){
		this.urut = urut;
	}

	public String getUrut(){
		return urut;
	}

	public void setRukuk(String rukuk){
		this.rukuk = rukuk;
	}

	public String getRukuk(){
		return rukuk;
	}

	public void setArti(String arti){
		this.arti = arti;
	}

	public String getArti(){
		return arti;
	}

	public void setKeterangan(String keterangan){
		this.keterangan = keterangan;
	}

	public String getKeterangan(){
		return keterangan;
	}

	@Override
 	public String toString(){
		return 
			"Model_Surat{" + 
			"nomor = '" + nomor + '\'' + 
			",nama = '" + nama + '\'' + 
			",asma = '" + asma + '\'' + 
			",name = '" + name + '\'' + 
			",start = '" + start + '\'' + 
			",ayat = '" + ayat + '\'' + 
			",type = '" + type + '\'' + 
			",urut = '" + urut + '\'' + 
			",rukuk = '" + rukuk + '\'' + 
			",arti = '" + arti + '\'' + 
			",keterangan = '" + keterangan + '\'' + 
			"}";
		}
}