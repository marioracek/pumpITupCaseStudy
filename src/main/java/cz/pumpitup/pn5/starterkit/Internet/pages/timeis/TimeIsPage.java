package cz.pumpitup.pn5.starterkit.Internet.pages.timeis;

import cz.pumpitup.pn5.actions.*;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.starterkit.Internet.pages.google.GoogleSearchResultsPage;
import cz.pumpitup.pn5.web.WebAgentAccessor;
import cz.pumpitup.pn5.web.actions.Navigate;
import org.openqa.selenium.By;

@Navigate("https://time.is/")
@Wait(value = TimeIsPage.ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
public interface TimeIsPage extends WebAgentAccessor {

    String ACCEPT_BUTTON_XPATH = "//div[@id='qc-cmp2-ui']//button[@mode='primary']";

    @Click(value = ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
    TimeIsPage acceptCookies();

    @Click("time-5")
    TimeIsPage selectLondon();
    @GetElementContent("clock0_bg")
    String getTime();
}
