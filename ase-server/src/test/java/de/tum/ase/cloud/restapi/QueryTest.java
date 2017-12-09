package de.tum.ase.cloud.restapi;

import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.utils.QueryParameterUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QueryTest {


    @Test
    public void comparatorTest() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student s = new Student();
            s.setId(new Long(i));
            s.setFirstName(String.valueOf(i));
            students.add(s);
        }
        // sort students descending by id
        students.sort(QueryParameterUtils.createComparator("id desc"));
        int i = 9;
        for (Student s : students) {
            Assert.assertEquals(s.getId(), new Long(i));
            i--;
        }
        // sort students ascending by id
        students.sort(QueryParameterUtils.createComparator("id asc"));
        i = 0;
        for (Student s : students) {
            Assert.assertEquals(s.getId(), new Long(i));
            i++;
        }

        students.sort(QueryParameterUtils.createComparator("firstname desc"));
        i = 9;
        for (Student s : students) {
            Assert.assertEquals(s.getId(), new Long(i));
            i--;
        }

        students.sort(QueryParameterUtils.createComparator("firstname asc"));
        i = 0;
        for (Student s : students) {
            Assert.assertEquals(s.getId(), new Long(i));
            i++;
        }
    }
}
