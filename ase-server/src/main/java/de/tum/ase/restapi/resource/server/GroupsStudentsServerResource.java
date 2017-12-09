package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.representation.Group;
import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.resource.GroupsStudentsResource;
import de.tum.ase.restapi.utils.QueryParameterUtils;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupsStudentsServerResource extends AbstractServerResource implements GroupsStudentsResource {

    // Define allowed roles for the method "get".
    private static final String[] get12AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get12DeniedGroups = new String[]{};

    public List<Student> represent() throws Exception {
        List<Student> result = null;
        checkGroups(get12AllowedGroups, get12DeniedGroups);


        try {
            String size = getQueryValue("$size");
            String page = getQueryValue("$page");
            String sort = getQueryValue("$sort");

            // Query parameters
            List<Group> groups = ObjectifyService.ofy().load().type(Group.class).list();
            List<Long> studentIds = groups.stream()
                    .filter(p -> !p.isEmpty())
                    .map(m -> m.getStudents())
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());

            List<Student> students = ObjectifyService.ofy()
                    .load()
                    .type(Student.class)
                    .filter("id in", studentIds)
                    .list();

            Stream<Student> studentStream = students.stream();

            int length = (size != null) ? toInteger(size) : students.size();
            if (sort != null) {
                studentStream = studentStream.sorted(QueryParameterUtils.createComparator(sort));
            }
            result = studentStream.limit(length).collect(Collectors.toList());

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

