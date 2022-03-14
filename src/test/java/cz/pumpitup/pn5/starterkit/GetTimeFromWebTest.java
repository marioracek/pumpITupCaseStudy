package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.LogLevel;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class GetTimeFromWebTest {

    @Test
    public void getCurrentTimeOnTheWeb(Firefox firefox) {
        String timeString = firefox
                .openTimeIsPage()
                .acceptCookies()
                .selectLondon()
                .getTime();
        firefox.getLogger().log(LogLevel.INFO, timeString);
        Instant dateTimeFromWeb = MyHelpers.dateTimeFromTimeString(timeString);
        firefox.getLogger().log(LogLevel.INFO, dateTimeFromWeb.toString());
    }
}