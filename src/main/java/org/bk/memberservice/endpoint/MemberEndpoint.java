package org.bk.memberservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.bk.memberservice.message.MemberDetailsRequest;
import org.bk.memberservice.message.MemberDetailsResponse;
import org.bk.memberservice.message.MemberSearchRequest;
import org.bk.memberservice.message.MemberSearchResponse;

@WebService(targetNamespace="http://bk.org/memberservice/")
public interface MemberEndpoint {
	@WebMethod(operationName = "getMemberDetails")
	@WebResult(name = "MemberDetailsResponse", targetNamespace = "http://bk.org/memberservice/")
	MemberDetailsResponse getMemberDetails(
			@WebParam(name = "MemberDetailsRequest") MemberDetailsRequest memberDetailsRequest);
	
	@WebMethod(operationName = "searchMember")
	@WebResult(name = "MemberSearchResponse", targetNamespace = "http://bk.org/memberservice/")
	MemberSearchResponse searchMember(@WebParam(name = "MemberSearchRequest") MemberSearchRequest memberSearchRequest);
}
