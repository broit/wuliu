package com.broit.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StringUtil { 
	
	 private static Log log  = LogFactory.getLog(SqlSessionCache.class); 
	
	/**
	 * 转换字符的编码
	 * @param str
	 * @param decode1
	 * @param decode2
	 * @return
	 */
	public static String converDecode(String str,String decode1,String decode2){
		try {
			if(StringUtils.isEmpty(str)){
				return "";
			}
			if(StringUtils.isEmpty(decode1)){
				decode1 = "GBK";
			}
			if(StringUtils.isEmpty(decode2)){
				decode2 = "iso8859-1";
			}
			return new String(str.getBytes(decode1),decode2);
		} catch (UnsupportedEncodingException e) {
			log.error(e);
			e.printStackTrace();
		}
		return str;
	}

	
}