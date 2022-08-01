package cz.pumpitup.pn5.starterkit.Internet.pages.pumpodev;

import cz.pumpitup.pn5.actions.AssertElementContent;
import cz.pumpitup.pn5.actions.AssertElementPresent;
import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebAgentAccessor;

@Wait(value = PumpoDevFivePage.GETTING_STARTED_BUTTON_XPATH, by = Lookup.XPATH)
public interface PumpoDevFivePage extends WebAgentAccessor {

    String GETTING_STARTED_BUTTON_XPATH = "//div[contains(@class, 'cover-main')]//a[contains(text(), 'Getting Started')]";
    String FARM_CONFIGURATION = "//div[contains(@class, 'sidebar-nav')]//a[contains(@title, 'Farm configuration')]";
    String CAPABILITIES_CONFIGURATION = "//div[contains(@class, 'sidebar-nav')]//a[contains(@title, 'Capabilities configuration')]";

    @AssertElementPresent(value = "//*[contains(text(), \"%s\")]", by = Lookup.XPATH, timeout = 30)
    PumpoDevFivePage assertThatContainsText(String text);

    @AssertElementContent(value = "//*[contains(text(), 'Capabilities available on the farm are')]//parent::p", by = Lookup.XPATH)
    PumpoDevFivePage assertElementContent(String text);

    @Click(value = GETTING_STARTED_BUTTON_XPATH, by = Lookup.XPATH)
    PumpoDevFivePage clickOnGettingStartedButton();

    @Click(value = FARM_CONFIGURATION, by = Lookup.XPATH)
    PumpoDevFivePage clickOnFarmConfiguration();

    @Click(value = CAPABILITIES_CONFIGURATION, by = Lookup.XPATH)
    PumpoDevFivePage clickOnCapabilitiesConfiguration();

}