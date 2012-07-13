package org.bk.memberservice.endpoint;

import javax.jws.WebService;

import org.bk.memberservice.message.MemberDetailsRequest;
import org.bk.memberservice.message.MemberDetailsResponse;
import org.bk.memberservice.message.MemberSearchRequest;
import org.bk.memberservice.message.MemberSearchResponse;
import org.bk.memberservice.service.MemberManager;
import org.bk.memberservice.types.MemberDetail;
import org.springframework.beans.factory.annotation.Autowired;

@WebService(serviceName="MemberService", endpointInterface="org.bk.memberservice.endpoint.MemberEndpoint", targetNamespace="http://bk.org/memberservice/")
public class DefaultMemberEndpoint implements MemberEndpoint {
	@Autowired private MemberManager memberManager;
	
	@Override
	public MemberDetailsResponse getMemberDetails(MemberDetailsRequest memberDetailsRequest) {
		MemberDetail memberDetail = memberManager.findByMemberId(memberDetailsRequest.getId());
		MemberDetailsResponse response = new MemberDetailsResponse(memberDetail);
		return response;
	}
	
	

	public void setMemberManager(MemberManager memberManager) {
		this.memberManager = memberManager;
	}



	@Override
	public MemberSearchResponse searchMember(MemberSearchRequest memberSearchRequest) {
		return new MemberSearchResponse(this.memberManager.findByMemberName(memberSearchRequest.getName()));
	}
	
}
