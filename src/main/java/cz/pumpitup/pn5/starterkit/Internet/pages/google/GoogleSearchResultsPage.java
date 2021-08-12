package cz.pumpitup.pn5.starterkit.Internet.pages.google;

import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.ExtendedAction;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup.PumpITupHomePage;
import cz.pumpitup.pn5.web.WebDriverAccessor;

@Wait(value = GoogleSearchResultsPage.RESULT_PAGE_SYMPTOM_XPATH, by = Lookup.XPATH, timeout = 20)
public interface GoogleSearchResultsPage extends WebDriverAccessor {

    String RESULT_PAGE_SYMPTOM_XPATH = "/html/body//div[@class=\"g\"]";
    String FIRST_RESULT_LINK_XPATH = "//div[@class=\"g\"][1]//a[1]";

    @Click(value = FIRST_RESULT_LINK_XPATH, by = Lookup.XPATH)
    GoogleSearchResultsPage clickThroughFirstResult();

    @ExtendedAction
    default GoogleSearchResultsPage printTitle() {
        System.out.println(getDriver().getTitle());
        return this;
    }

    PumpITupHomePage onPumpITupHomePage();

}