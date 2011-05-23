package org.bk.memberservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.bk.memberservice.message.MemberDetailsRequest;
import org.bk.memberservice.message.MemberDetailsResponse;

@WebService
public interface MemberEndpoint {
	@WebMethod(operationName = "MemberDetailsRequest")
	@WebResult(name = "MemberDetailsResponse", targetNamespace = "http://bk.org/memberservice/")
	MemberDetailsResponse getMemberDetails(
			@WebParam(name = "MemberDetailsRequest") MemberDetailsRequest memberDetailsRequest);
}
