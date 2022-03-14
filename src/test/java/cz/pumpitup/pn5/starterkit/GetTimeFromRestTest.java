package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.LogLevel;
import cz.pumpitup.pn5.core.webdriver.Capability;
import cz.pumpitup.pn5.remote.http.HttpApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

public class GetTimeFromRestTest {

    @Test
    public void getCurrentTimeViaRest(HttpClient restClient) {
        Instant currentDate = restClient
                .prepareRestRequest("http://worldtimeapi.org/api/timezone/Europe/Prague", "GET")
                .sendAndGetResponse()
                .payloadAs(TimeResponse.class)
                .datetime;
        Duration timeDiff = Duration.between(currentDate, Instant.now()).abs();
        restClient.getLogger().log(LogLevel.INFO, timeDiff.toString());
        Assertions.assertFalse(timeDiff.minus(Duration.ofMillis(10)).isNegative());
    }

    public static class TimeResponse {
        public Instant datetime;
    }

}
