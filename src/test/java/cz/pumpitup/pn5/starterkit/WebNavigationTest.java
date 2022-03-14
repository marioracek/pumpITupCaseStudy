package cz.pumpitup.pn5.starterkit;

import org.junit.jupiter.api.Test;

public class WebNavigationTest {

    @Test
    public void searchPumpITupOnGoogle(Firefox firefox) {
        firefox
//                .waitSecondsOf(10)
                .openGoogleSearchPage()
                    .acceptCookies()
                    .typeIntoSearchBox("pumpitup sro")
                    .submit()
                .onSearchResultsPage()
                    .clickThroughFirstResult()
                .onPumpITupHomePage()
                    .assertThatContainsText("DevOps");
    }
}