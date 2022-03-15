package cz.pumpitup.pn5.starterkit;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class MyHelpers {
    static Instant instantFromTimeString(String timeString) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(new Date());
        String isoDateTimeString = dateString + "T" + timeString + "Z";
        return Instant.parse(isoDateTimeString);
    }
}
