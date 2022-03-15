package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.LogLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

public class CompareTimeTest {

    @Test
    public void compareTimes(Firefox firefox, HttpClient restClient) {
        String timeString = firefox
                .openTimeIsPage()
                .acceptCookies()
                .selectLondon()
                .getTime();
        Instant dateTimeFromWeb = MyHelpers.instantFromTimeString(timeString);
        Instant dateTimeFromRest = restClient
                .prepareRestRequest("http://worldtimeapi.org/api/timezone/Europe/Prague", "GET")
                .sendAndGetResponse()
                .payloadAs(GetTimeFromRestTest.TimeResponse.class)
                .datetime;
        Duration timeDelta = Duration.between(dateTimeFromWeb, dateTimeFromRest);
        restClient.getLogger().log(LogLevel.INFO, timeDelta.toString());
        Assertions.assertFalse(timeDelta.minus(Duration.ofMillis(1000)).isNegative());
    }

}