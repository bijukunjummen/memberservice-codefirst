package org.bk.memberservice.endpoint;

import javax.jws.WebService;

import org.bk.memberservice.message.MemberDetailsRequest;
import org.bk.memberservice.message.MemberDetailsResponse;
import org.bk.memberservice.service.MemberManager;
import org.bk.memberservice.types.MemberDetail;
import org.springframework.beans.factory.annotation.Autowired;

@WebService(endpointInterface="org.bk.memberservice.endpoint.MemberEndpoint")
public class DefaultMemberEndpoint implements MemberEndpoint {
	@Autowired private MemberManager memberManager;
	
	@Override
	public MemberDetailsResponse getMemberDetails(MemberDetailsRequest memberDetailsRequest) {
		MemberDetail memberDetail = memberManager.getMemberDetails(memberDetailsRequest.getId());
		MemberDetailsResponse response = new MemberDetailsResponse(memberDetail);
		return response;
	}

	public void setMemberManager(MemberManager memberManager) {
		this.memberManager = memberManager;
	}
	
}
