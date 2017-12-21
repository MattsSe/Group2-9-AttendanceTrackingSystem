package de.tum.ase.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeekIdGenerator {

    /**
     * Formats a date to the current weekid, we use double digits for current year and current month of the year
     */
    protected static DateFormat WEEK_ID_FORMAT = new SimpleDateFormat("yyww");

    /**
     * The week id is the current year followed by the current week of the year,
     * since only one tutorial per week
     *
     * @return a new generated weekid
     */
    public static String generateWeekId() {
        return generateWeekId(new Date());
    }

    /**
     *
     * @param date
     * @return
     */
    public static String generateWeekId(Date date) {
        return WEEK_ID_FORMAT.format(date);
    }
}
