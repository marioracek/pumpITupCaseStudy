package cz.pumpitup.pn5.starterkit;

import org.junit.jupiter.api.Test;
import cz.pumpitup.pn5.web.WebApplication;

public class SingleTest {

    @Test
    //public void test(Google google) {
    public void test(Firefox google) {
        google.openSearchPage()
                    .AcceptCookies()
                    .typeIntoSearchBox("BrowserStack")
                    .submit()
                .onSearchResultsPage()
                    .assertTitleIs("BrowserStack - Google Search");
    }
}