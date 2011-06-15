package org.bk.memberservice.endpoint;

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.handler.RequestData;
import org.apache.ws.security.validate.Credential;
import org.apache.ws.security.validate.Validator;

public class CustomUserNameTokenValidator implements Validator {

    @Override
    public Credential validate(Credential credential, RequestData data) throws WSSecurityException {
        String userName =  credential.getUsernametoken().getName();
        String password = credential.getUsernametoken().getPassword();
        if (isValid(userName, password)){
            return credential;
        }
        
        throw new WSSecurityException("Invalid Credentials");
        
    }
    
    private boolean isValid(String userName, String password){
        return true;
    }

}
