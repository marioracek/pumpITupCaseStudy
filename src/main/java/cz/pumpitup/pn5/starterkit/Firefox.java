package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.webdriver.Capability;
import cz.pumpitup.pn5.core.webdriver.ValueType;
import cz.pumpitup.pn5.web.WebApplication;
import cz.pumpitup.pn5.starterkit.Internet.pages.google.GoogleSearchPage;


@Capability(key = "browserName", value = "firefox")
@Capability(key = "enableVNC", value = "true", type = ValueType.BOOLEAN)
public interface Firefox extends WebApplication {

    default GoogleSearchPage openGoogleSearchPage() {
        return open(GoogleSearchPage.class);
    }

    default Firefox waitSecondsOf(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

}