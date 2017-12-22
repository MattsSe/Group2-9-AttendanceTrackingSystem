package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.representation.Group;
import de.tum.ase.restapi.resource.GroupsGroupidResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class GroupsGroupidServerResource extends AbstractServerResource implements GroupsGroupidResource {

    // Define allowed roles for the method "get".
    private static final String[] get3AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get3DeniedGroups = new String[]{};
    // Define allowed roles for the method "put".
    private static final String[] put4AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "put".
    private static final String[] put4DeniedGroups = new String[]{};
    // Define allowed roles for the method "delete".
    private static final String[] delete5AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "delete".
    private static final String[] delete5DeniedGroups = new String[]{};

    public Group represent() throws Exception {
        de.tum.ase.restapi.representation.Group result = null;
        checkGroups(get3AllowedGroups, get3DeniedGroups);

        try {
            // Path variables
            String groupId = Reference.decode(getAttribute("groupid"));

            // Query parameters
            result = ObjectifyService
                    .ofy()
                    .load()
                    .type(Group.class)
                    .id(groupId)
                    .now();

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    /**
     * update a group
     *
     * @param bean
     * @return
     * @throws Exception
     */
    public Group store(Group bean) throws Exception {
        de.tum.ase.restapi.representation.Group result = null;
        checkGroups(put4AllowedGroups, put4DeniedGroups);

        if (bean == null || !bean.isValid()) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
        }

        try {

            ObjectifyService.ofy().save().entity(bean);
            result = bean;

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    public void remove() throws Exception {
        checkGroups(delete5AllowedGroups, delete5DeniedGroups);

        try {

            String groupId = Reference.decode(getAttribute("groupId"));
            ObjectifyService.ofy().delete().type(Group.class).id(groupId);

        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }


    }


}

