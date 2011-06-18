package org.bk.memberservice.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MemberDetailsRequest", namespace="http://bk.org/memberservice/")
public class MemberDetailsRequest {

    private Long id;
    
	public MemberDetailsRequest() {
	}

	public MemberDetailsRequest(Long id) {
		this.id = id;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
