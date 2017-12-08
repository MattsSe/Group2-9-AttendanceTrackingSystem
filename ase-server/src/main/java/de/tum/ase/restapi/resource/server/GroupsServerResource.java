package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.resource.GroupsResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class GroupsServerResource extends AbstractServerResource implements GroupsResource {

    // Define allowed roles for the method "get".
    private static final String[] get1AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get1DeniedGroups = new String[]{};


    @Override
    protected void doInit() throws ResourceException {

    }

    public de.tum.ase.restapi.representation.Group represent() throws Exception {
        de.tum.ase.restapi.representation.Group result = null;
        checkGroups(get1AllowedGroups, get1DeniedGroups);


        try {

            // Query parameters


            result = new de.tum.ase.restapi.representation.Group();

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    // Define allowed roles for the method "post".
    private static final String[] post2AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post2DeniedGroups = new String[]{};

    public de.tum.ase.restapi.representation.Group add(de.tum.ase.restapi.representation.Group bean) throws Exception {
        de.tum.ase.restapi.representation.Group result = null;
        checkGroups(post2AllowedGroups, post2DeniedGroups);

        if (bean == null) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
        }

        try {

            // Query parameters

//            Key<Guestbook> theBook = Key.create(Guestbook.class, guestbookName);
//
//            // Run an ancestor query to ensure we see the most up-to-date
//            // view of the Greetings belonging to the selected Guestbook.
//            List<Greeting> greetings = ObjectifyService.ofy()
//                    .load()
//                    .type(Greeting.class) // We want only Greetings
//                    .ancestor(theBook)    // Anyone in this book
//                    .order("-date")       // Most recent first - date is indexed.
//                    .limit(5)             // Only show 5 of them.
//                    .list();

            result = new de.tum.ase.restapi.representation.Group();
            result.setId("my Gourpd");
            ObjectifyService.ofy().save().entity(result).now();


            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }


}

