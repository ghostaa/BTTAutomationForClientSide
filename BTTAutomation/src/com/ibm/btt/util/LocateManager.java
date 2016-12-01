package com.ibm.btt.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class LocateManager {
	private String nls_forder=System.getProperty("user.dir")+"/nls";
	private String locate;
	private String locate_path;
	private BufferedReader bufferReader;
	private static JSONObject  locate_json_cacheString=null;
	private static String  locate_flag=null;
	private String getLocate_path() {
		return locate_path;
	}
	private void setLocate_path() {
		Set<String> en_us_set=new HashSet<String>();
		Set<String> es_es_set=new HashSet<String>();
		Set<String> zh_cn_set=new HashSet<String>();
		Set<String> ko_kr_set=new HashSet<String>();
		Set<String> ko_set=new HashSet<String>();
		//en_US
		en_us_set.add("en_us");
		en_us_set.add("en_US");
		en_us_set.add("en-us");
		en_us_set.add("en-US");
		//es_ES
		es_es_set.add("es_es");
		es_es_set.add("es_ES");
		es_es_set.add("es-ES");
		es_es_set.add("es-es");
		//zh_CN
		zh_cn_set.add("zh_cn");
		zh_cn_set.add("zh_CN");
		zh_cn_set.add("zh-CN");
		zh_cn_set.add("zh-cn");
		//ko
		ko_set.add("ko");
		//ko_KR
		ko_kr_set.add("ko_kr");
		ko_kr_set.add("ko_KR");
		ko_kr_set.add("ko-KR");
		ko_kr_set.add("ko-kr");
		
		
		if(en_us_set.contains(getLocate())){
			this.locate_path="en-us";
		}else if(es_es_set.contains(getLocate())){
			this.locate_path="es-es";
		}else if(zh_cn_set.contains(getLocate())){
			this.locate_path="zh-cn";
		}else if(ko_set.contains(getLocate())){
			this.locate_path="ko";
		}else if(ko_kr_set.contains(getLocate())){
			this.locate_path="ko-kr";
		}else {
			this.locate_path=getLocate();
		}
	}
	private String getNLSforderPath(){
		return this.nls_forder;
	}
	private String getLocate() {
		return locate;
	} 
	private void setLocate(String locate) {
		this.locate=locate;
		setLocate_path();
	}
	private String getNLS(String NLSName) throws IOException{
		FileReader reader = new FileReader(new File(getNLSforderPath()+"/"+getLocate_path()+"/"+NLSName));
		bufferReader = new BufferedReader(reader);
		String line = bufferReader.readLine();
		StringBuffer nls_context = new StringBuffer();
//		System.out.println(line);
		while (line!=null) {
			nls_context.append(line);
			line = bufferReader.readLine();
		}
		System.out.println(nls_context);
		return nls_context.toString();
		
	}
	private JSONObject getLocateJsonObject(String fileName){
		if (locate_flag!=Main_Class.LOCATE) {
			locate_json_cacheString=null;
		}
		if(locate_json_cacheString==null){
			try {
				String str = replaceNonJsonChar(this.getNLS(fileName));
				System.out.println(str);
				locate_json_cacheString= new JSONObject(str);
				return this.locate_json_cacheString;
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return this.locate_json_cacheString;
	}
	private String replaceNonJsonChar(String str){
		return str.substring(7,str.length()-2);
	}
	
	public String getNLSValue(String NLSFile, String NLSKey) {
		this.setLocate(Main_Class.LOCATE);
		if (!NLSFile.contains(".js")) {
			NLSFile+=".js";
		}
		try {
			return this.getLocateJsonObject(NLSFile).get(NLSKey).toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	/*@Test
	public void rTest(){
		System.out.println(System.getProperty("user.dir"));
			this.setLocate("en_us");
//			this.getNLS("bttsample.js");
		try {
			System.out.println(this.getLocateJsonObject("bttsample.js").get("IBKE2E_Need_Info"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	
}
