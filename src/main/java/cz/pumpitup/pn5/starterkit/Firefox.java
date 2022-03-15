package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.webdriver.Capability;
import cz.pumpitup.pn5.core.webdriver.ValueType;
import cz.pumpitup.pn5.starterkit.Internet.pages.timeis.TimeIsPage;
import cz.pumpitup.pn5.web.WebApplication;
import cz.pumpitup.pn5.starterkit.Internet.pages.google.GoogleSearchPage;


@Capability(key = "browserName", value = "firefox")
@Capability(key = "enableVNC", value = "true", type = ValueType.BOOLEAN)
public interface Firefox extends WebApplication {

    default GoogleSearchPage openGoogleSearchPage() {
        return open(GoogleSearchPage.class);
    }

    default TimeIsPage openTimeIsPage() {
        return open(TimeIsPage.class);
    }

    default Firefox waitSecondsOf(int seconds) {
        try {
            System.out.println("Waiting for " + seconds + " seconds");
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException ignored) {
        }
        return this;
    }

}