package de.tum.ase.restapi.verify;

import org.restlet.security.SecretVerifier;

public class AseVeryfier extends SecretVerifier {

    private SecurityDao securityDao;

    public AseVeryfier(SecurityDao securityDao) {
        this.securityDao = securityDao;
    }

    @Override
    public int verify(String identifier, char[] secret) {
        System.out.println(identifier);
        System.out.println(secret);
        if (securityDao.hasUserPassword(identifier, new String(secret)))
            return RESULT_VALID;
        else
            return RESULT_INVALID;
    }
}
