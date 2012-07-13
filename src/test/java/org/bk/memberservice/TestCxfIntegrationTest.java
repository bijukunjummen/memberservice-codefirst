package org.bk.memberservice;

import static org.junit.Assert.*;

import org.bk.memberservice.endpoint.MemberEndpoint;
import org.bk.memberservice.message.MemberDetailsRequest;
import org.bk.memberservice.message.MemberSearchRequest;
import org.bk.memberservice.message.MemberSearchResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/integ-test.xml")
public class TestCxfIntegrationTest {

	@Autowired
	MemberEndpoint memberService;
	@Test
	public void testCxfIntegration() {
		MemberSearchRequest memberSearchRequest = new MemberSearchRequest();
		memberSearchRequest.setName("john doe1");
		MemberSearchResponse memberResponse = memberService.searchMember(memberSearchRequest );
		System.out.println(memberResponse);
	}

}
