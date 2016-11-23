package com.broit.model.dto;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.broit.model.AccDocArchive;
import com.broit.util.DateSerializer;

public class AccDocArchiveDto extends AccDocArchive{
	private String owner;
	
	private String refid;

    private String doctitle;
    
    private String docdesc;
    
    private String creater;
    
    private  Date createdate;
    
    private String mouldid;
    
    private List<AccDocArchiveDto> list;

	public List<AccDocArchiveDto> getList() {
		return list;
	}

	public void setList(List<AccDocArchiveDto> list) {
		this.list = list;
	}

	public String getMouldid() {
		return mouldid;
	}

	public void setMouldid(String mouldid) {
		this.mouldid = mouldid;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRefid() {
		return refid;
	}

	public void setRefid(String refid) {
		this.refid = refid;
	}

	public String getDoctitle() {
		return doctitle;
	}

	public void setDoctitle(String doctitle) {
		this.doctitle = doctitle;
	}

	public String getDocdesc() {
		return docdesc;
	}

	public void setDocdesc(String docdesc) {
		this.docdesc = docdesc;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	 @JsonSerialize(using = DateSerializer.class)
	public  Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate( Date createdate) {
		this.createdate = createdate;
	}
    
    
	
	
}