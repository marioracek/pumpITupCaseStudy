package cz.pumpitup.pn5.starterkit;

import org.junit.jupiter.api.Test;

public class SimpleNavigationTest {

    @Test
    public void test(Firefox firefox) {
        firefox
//                .waitSecondsOf(10)
                .openGoogleSearchPage()
                    .acceptCookies()
                    .printTitle()
                    .typeIntoSearchBox("pumpitup sro")
                    .submit()
                .onSearchResultsPage()
                    .printTitle()
                    .clickThroughFirstResult()
                .onPumpITupHomePage()
                    .printTitle()
                    .assertThatContainsText("DevOps");
    }
}