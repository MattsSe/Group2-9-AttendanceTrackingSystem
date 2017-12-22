package de.tum.ase.restapi.utils;

import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;

public class QueryParameterUtils {


    public static <T, S extends Comparable> Comparator<T> createComparator(String sortQueryValue) {
        if (sortQueryValue == null) {
            throw new IllegalArgumentException("The sortQueryValue must not be null.");
        }
        String[] vals = sortQueryValue.trim().toLowerCase().split(" |\\+");
        if (vals.length != 2) {
            throw new IllegalArgumentException("The sortQueryValue must consist of filed name and sorting order.");
        }

        boolean asc = vals[1].equals("asc");

        Comparator<T> c = (o1, o2) -> {
            Field[] f = o1.getClass()
                    .getDeclaredFields();
            Optional<Method> optionalMethod = Arrays.stream(o1.getClass()
                    .getMethods()).filter(p -> p.getName().equalsIgnoreCase("get" + vals[0])).findFirst();

            if (optionalMethod.isPresent()) {
                Method method = optionalMethod.get();
                try {
                    S v1 = (S) method.invoke(o1);
                    S v2 = (S) method.invoke(o2);
                    return asc ?  v1.compareTo(v2) : v2.compareTo(v1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return 0;
        };
        return c;
    }

    /**
     * Throws an {@link IllegalArgumentException} if no Integer can be parsed
     * from the variable's value.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static void checkInteger(String name, String value) {
        toInteger(name, value);
    }

    /**
     * Returns the Integer parsed from the variable's value. Throws an
     * {@link IllegalArgumentException} if no Integer can be parsed.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static Integer toInteger(String name, String value) {
        try {
            return BindingUtils.toInteger(value);
        } catch (IllegalArgumentException e) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST,
                    "Bad query parameter [" + name + "]: " + e.getMessage());
        }
    }

    /**
     * Throws an {@link IllegalArgumentException} if no Long can be parsed from
     * the variable's value.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static void checkLong(String name, String value) {
        toLong(name, value);
    }

    /**
     * Returns the Long parsed from the variable's value. Throws an
     * {@link IllegalArgumentException} if no Long can be parsed.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static Long toLong(String name, String value) {
        try {
            return BindingUtils.toLong(value);
        } catch (IllegalArgumentException e) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST,
                    "Bad query parameter [" + name + "]: " + e.getMessage());
        }
    }

    /**
     * Throws an {@link IllegalArgumentException} if no Date can be parsed from
     * the variable's value.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static void checkDate(String name, String value) {
        toDate(name, value);
    }

    /**
     * Returns the Date parsed from the variable's value. Throws an
     * {@link IllegalArgumentException} if no Date can be parsed.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static Date toDate(String name, String value) {
        try {
            return BindingUtils.toDate(value);
        } catch (IllegalArgumentException e) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST,
                    "Bad query parameter [" + name + "]: " + e.getMessage());
        }
    }

    /**
     * Throws an {@link IllegalArgumentException} if no Double can be parsed
     * from the variable's value.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static void checkDouble(String name, String value) {
        toDouble(name, value);
    }

    /**
     * Returns the Double parsed from the variable's value. Throws an
     * {@link IllegalArgumentException} if no Double can be parsed.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static Double toDouble(String name, String value) {
        try {
            return BindingUtils.toDouble(value);
        } catch (IllegalArgumentException e) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST,
                    "Bad query parameter [" + name + "]: " + e.getMessage());
        }
    }

    /**
     * Throws an {@link IllegalArgumentException} if no Float can be parsed from
     * the variable's value.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static void checkFloat(String name, String value) {
        toFloat(name, value);
    }

    /**
     * Returns the Float parsed from the variable's value. Throws an
     * {@link IllegalArgumentException} if no Float can be parsed.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static Float toFloat(String name, String value) {
        try {
            return BindingUtils.toFloat(value);
        } catch (IllegalArgumentException e) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST,
                    "Bad query parameter [" + name + "]: " + e.getMessage());
        }
    }

    /**
     * Throws an {@link IllegalArgumentException} if no Boolean can be parsed
     * from the variable's value.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static void checkBoolean(String name, String value) {
        toBoolean(name, value);
    }

    /**
     * Returns the Boolean parsed from the variable's value. Throws an
     * {@link IllegalArgumentException} if no Boolean can be parsed from the
     * variable's value.
     *
     * @param name  The name of the query parameter.
     * @param value The variable's value.
     */
    public static Boolean toBoolean(String name, String value) {
        try {
            return BindingUtils.toBoolean(value);
        } catch (IllegalArgumentException e) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST,
                    "Bad query parameter [" + name + "]: " + e.getMessage());
        }
    }
}
