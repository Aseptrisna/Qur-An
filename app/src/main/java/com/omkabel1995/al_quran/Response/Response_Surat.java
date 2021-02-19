package com.omkabel1995.al_quran.Response;

import com.google.gson.annotations.SerializedName;
import com.omkabel1995.al_quran.Model.Model_Surat;

import java.util.List;
import java.io.Serializable;

public class Response_Surat implements Serializable {
	@SerializedName("status")
	private String status;
	@SerializedName("hasil")
	private List<Model_Surat> hasil;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setHasil(List<Model_Surat> hasil){
		this.hasil = hasil;
	}

	public List<Model_Surat> getHasil(){
		return hasil;
	}

	@Override
 	public String toString(){
		return 
			"Response_Surat{" + 
			"status = '" + status + '\'' + 
			",hasil = '" + hasil + '\'' + 
			"}";
		}
}