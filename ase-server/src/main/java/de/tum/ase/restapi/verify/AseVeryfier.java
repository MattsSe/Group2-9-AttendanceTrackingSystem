package de.tum.ase.restapi.verify;

import org.restlet.Request;
import org.restlet.Response;
import org.restlet.security.SecretVerifier;
import org.restlet.security.User;

public class AseVeryfier extends SecretVerifier {

    private SecurityDao securityDao;

    public AseVeryfier(SecurityDao securityDao) {
        this.securityDao = securityDao;
    }

    @Override
    protected User createUser(String identifier, Request request, Response response) {
        return this.securityDao.loadUser(identifier);
    }

    @Override
    public int verify(String identifier, char[] secret) {
        if (securityDao.hasUserPassword(identifier, new String(secret)))
            return RESULT_VALID;
        else
            return RESULT_INVALID;
    }
}
