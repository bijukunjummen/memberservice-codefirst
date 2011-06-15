package org.bk.memberservice.endpoint;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class UsernameTokenCallback implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		Callback callback = callbacks[0];
		WSPasswordCallback pc = (WSPasswordCallback) callback;
		
		//Retrieve password for user from local store and set it here...
		//Hardcoding to test for the test scenario..
		pc.setPassword("test");
	}
}
