package de.tum.ase.data;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.representation.*;
import de.tum.ase.restapi.representation.Error;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * OfyHelper, a ServletContextListener, is setup in web.xml to run before a JSP is run.  This is
 * required to let JSP's access Ofy.
 **/
public class OfyHelper  implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        // This will be invoked as part of a warmup request, or the first user request if no warmup
        // request.
        ObjectifyService.register(AttendanceRecord.class);
        ObjectifyService.register(Error.class);
        ObjectifyService.register(Group.class);
        ObjectifyService.register(QrCode.class);
        ObjectifyService.register(Student.class);
        ObjectifyService.register(Secret.class);
        DatastoreService datastoreService = DatastoreServiceFactory.getDatastoreService();
    }

    public void contextDestroyed(ServletContextEvent event) {
        // App Engine does not currently invoke this method.
    }
}
