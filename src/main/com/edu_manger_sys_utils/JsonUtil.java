package com.edu_manger_sys_utils;

import com.google.gson.Gson;

public class JsonUtil {
	public String toJson(Object object){
		Gson g =new Gson();
		//String str ="{\"success\":true,\"message\": \"success\",\"data\":";
		//return str+g.toJson(object)+"}";
		return	g.toJson(object);
	}
}
