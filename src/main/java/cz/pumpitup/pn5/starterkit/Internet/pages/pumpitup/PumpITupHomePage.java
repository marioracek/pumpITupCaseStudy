package cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup;

import cz.pumpitup.pn5.actions.AssertElementPresent;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebAgentAccessor;

@Wait(value = PumpITupHomePage.RESULT_PAGE_SYMPTOM_XPATH, by = Lookup.XPATH)
public interface PumpITupHomePage extends WebAgentAccessor {

    String RESULT_PAGE_SYMPTOM_XPATH = "//div[@id=\"intro\"]";

    @AssertElementPresent(value = "//*[contains(text(), \"%s\")]", by = Lookup.XPATH)
    PumpITupHomePage assertThatContainsText(String text);

}