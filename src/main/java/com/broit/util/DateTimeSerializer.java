package com.broit.util;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

/** 
 * 自定义时间，序列化类 
 *  
 * yyyy-MM-dd hh:mm:ss 
 *  
 * @author deniro 
 */  
public class DateTimeSerializer extends JsonSerializer<Date> {  
  
    @Override  
    public void serialize(Date value, JsonGenerator jgen,  
            SerializerProvider provider) throws IOException,  
            JsonProcessingException {  
        String text = "";
        if(value!=null)
        {
        	text = DateUtil.format(value, "yyyy-MM-dd HH:mm:ss");
        }
    	jgen.writeString(text);  
  
    }  
}  
