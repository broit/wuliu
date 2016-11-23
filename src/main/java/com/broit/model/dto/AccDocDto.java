package com.broit.model.dto;

import com.broit.model.AccDoc;

public class AccDocDto extends AccDoc {

    private String docid;

    private String summary;

    private String archive;

	public String getDocid() {
		return docid;
	}

	public void setDocid(String docid) {
		this.docid = docid;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getArchive() {
		return archive;
	}

	public void setArchive(String archive) {
		this.archive = archive;
	}
    
    
}