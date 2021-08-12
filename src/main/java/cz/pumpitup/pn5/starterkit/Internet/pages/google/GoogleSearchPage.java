package cz.pumpitup.pn5.starterkit.Internet.pages.google;

import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.ExtendedAction;
import cz.pumpitup.pn5.actions.SetValue;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebDriverAccessor;
import cz.pumpitup.pn5.web.actions.Navigate;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

@Navigate("https://www.google.com")
@Wait(value = GoogleSearchPage.ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
public interface GoogleSearchPage extends WebDriverAccessor {

    String ACCEPT_BUTTON_XPATH = "//button[2]";

    @Click(value = ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
    GoogleSearchPage acceptCookies();

    @ExtendedAction
    default GoogleSearchPage printTitle() {
        System.out.println(getDriver().getTitle());
        return this;
    }

    @SetValue(value = "q", by = Lookup.NAME)
    GoogleSearchPage typeIntoSearchBox(String term);

    @ExtendedAction
    default GoogleSearchPage submit() {
        getDriver().findElement(By.name("q")).submit();
        return null;
    }

    GoogleSearchResultsPage onSearchResultsPage();

}