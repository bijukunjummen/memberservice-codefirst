package org.bk.memberservice.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bk.memberservice.types.MemberDetail;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MemberDetailsResponse", namespace="http://bk.org/memberservice/")
public class MemberDetailsResponse {

	public MemberDetailsResponse() {
	}

	@XmlElement(name="memberdetail", namespace="http://bk.org/memberservice/")
	private MemberDetail memberDetail;

	public MemberDetailsResponse(MemberDetail memberDetail) {
		this.memberDetail = memberDetail;
	}

	public MemberDetail getMemberDetail() {
		return memberDetail;
	}

	public void setMemberDetail(MemberDetail memberDetail) {
		this.memberDetail = memberDetail;
	}

}
