package cz.pumpitup.pn5.starterkit.Internet.pages.google;

import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup.PumpITupHomePage;
import cz.pumpitup.pn5.starterkit.Internet.pages.pumpodev.PumpoDevFivePage;
import cz.pumpitup.pn5.web.WebAgentAccessor;

@Wait(value = GoogleSearchResultsPage.RESULT_PAGE_SYMPTOM_XPATH, by = Lookup.XPATH)
public interface GoogleSearchResultsPage extends WebAgentAccessor {

    String RESULT_PAGE_SYMPTOM_XPATH = "/html/body//div[@id='search']";
    String FIRST_RESULT_LINK_XPATH = "//div[@id='search']//a[1]/h3";

    @Click(value = FIRST_RESULT_LINK_XPATH, by = Lookup.XPATH)
    GoogleSearchResultsPage clickThroughFirstResult();

    PumpITupHomePage onPumpITupHomePage();

    PumpoDevFivePage onPumpoDevFivePage();
}