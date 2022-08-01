package cz.pumpitup.pn5.starterkit;

import org.junit.jupiter.api.Test;

public class WebNavigationTest {

    @Test
    public void searchPumpoDevAndCheck(Firefox firefox) {
        firefox
//                .waitSecondsOf(10)
                .openGoogleSearchPage()
                    .acceptCookies()
                    .typeIntoSearchBox("https://pumpo5.dev/")
                    .submit()
                .onSearchResultsPage()
                    .clickThroughFirstResult()
                .onPumpoDevFivePage()
                    .clickOnGettingStartedButton()
                    .assertThatContainsText("Usually test frameworks have the following architecture. All is based on the possibility to control browsers thanks to browser drivers.")
                    .clickOnFarmConfiguration()
                    .assertThatContainsText("Our currently preferred farm setup is using the open-source project Selenoid.")
                    .clickOnCapabilitiesConfiguration()
                    .assertElementContent("Capabilities available on the farm are listed in the configuration file config/browsers.json. Updating capabilities requires usually pulling new versions of images using the docker pull command and specifying the image to pull. After that it is also required to restart the selenoid component which can be done as docker restart selenoid.");
    }
}