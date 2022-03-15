package cz.pumpitup.pn5.starterkit.Internet.pages.timeis;

import cz.pumpitup.pn5.actions.*;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebAgentAccessor;
import cz.pumpitup.pn5.web.actions.Navigate;

@Navigate("https://time.is/")
@Wait(value = TimeIsPage.ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
public interface TimeIsPage extends WebAgentAccessor {

    String ACCEPT_BUTTON_XPATH = "//div[@id='qc-cmp2-ui']//button[@mode='primary']";
    String LONDON_ZONE = "time-5";
    String CLOCK = "clock0_bg";

    @Click(value = ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
    TimeIsPage acceptCookies();

    @Click(LONDON_ZONE)
    TimeIsPage selectLondon();

    @GetElementContent(CLOCK)
    String getTime();
}
