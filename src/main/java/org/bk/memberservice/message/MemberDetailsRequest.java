package org.bk.memberservice.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MemberDetailsRequest", namespace="http://bk.org/memberservice/")
public class MemberDetailsRequest {

    private String id;
    
	public MemberDetailsRequest() {
	}

	public MemberDetailsRequest(String id) {
		this.id = id;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
