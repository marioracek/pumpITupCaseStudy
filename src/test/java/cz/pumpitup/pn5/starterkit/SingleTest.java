package cz.pumpitup.pn5.starterkit;

import org.junit.jupiter.api.Test;

public class SingleTest {

    @Test
    public void test(Firefox firefox) {
        firefox.openSearchPage()
                    .AcceptCookies()
                    .typeIntoSearchBox("BrowserStack")
                    .submit()
                .onSearchResultsPage()
                    .assertTitleIs("BrowserStack - Google Search");
    }
}