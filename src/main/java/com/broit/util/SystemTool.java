package com.broit.util;

import java.io.InputStream;

public class SystemTool {
	public static InputStream getResourceInputStream(String resource){
		InputStream inputStream = SystemTool.class.getClassLoader().getResourceAsStream(resource);
		return inputStream;
//		return Thread.currentThread().getContextClassLoader().getResource("").getPath();
	}
	
	public static String getFileSeparator(){
		return System.getProperty("file.separator");
	}
	
	/**
	 * 路径组合
	 * @return
	 */
	public static String assembleDir(String dir_base,String dir_other)throws Exception{
		String dir_composite = "";
		
		if(dir_base.endsWith("\\") || dir_base.endsWith("/"))
			dir_composite = dir_base+dir_other;
		else
			dir_composite = dir_base + SystemTool.getFileSeparator() + dir_other;
		
		return dir_composite;
	}
}
