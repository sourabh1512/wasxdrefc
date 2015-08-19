package com.infinia.adapter.exception;

import java.io.File;
import java.util.HashMap;

public class BaseException extends Exception{

	public String getFileLocation(String merchantId) {

		return "";
	}
	
	public boolean writeErrorMessage(HashMap<String,String> errorMessage,File file){
		
		return true;
		
	}

}
