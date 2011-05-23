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
		pc.setPassword("test");
		System.out.println("Received cred: " + pc.getIdentifier() + " : " + pc.getPassword());
//		boolean isValid = true;
//		if (!isValid) {
//			throw new IOException("Bad Credentials");
//		}
	}
}
