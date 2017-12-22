package de.tum.ase.restapi.verify;

import org.restlet.data.ClientInfo;
import org.restlet.security.Enroler;

public class AseEnroler implements Enroler {
    @Override
    public void enrole(ClientInfo clientInfo) {
//https://stackoverflow.com/questions/30028907/restlet-authorization-by-method-and-user

//        UserAccount user = findUser(clientInfo.getUser().getIdentifier());
//
//        if (user != null) {
//            // Find all the inherited groups of this user
//            Set<Group> userGroups = findGroups(user);
//
//            // Add roles specific to this user
//            Set<Role> userRoles = findRoles(user);
//
//            for (Role role : userRoles) {
//                clientInfo.getRoles().add(role);
//            }
//
//            // Add roles common to group members
//            Set<Role> groupRoles = findRoles(userGroups);
//
//            for (Role role : groupRoles) {
//                clientInfo.getRoles().add(role);
//            }
//        }
    }
}
