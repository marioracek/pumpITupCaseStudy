package cz.pumpitup.pn5.starterkit.pages;

import cz.pumpitup.pn5.actions.ExtendedAction;
import cz.pumpitup.pn5.web.WebDriverAccessor;
import org.junit.jupiter.api.Assertions;

public interface SearchResultsPage extends WebDriverAccessor {

    @ExtendedAction
    default void assertTitleIs(String title) {
        Assertions.assertEquals(title, getDriver().getTitle(), "Unexpected title");
    }

}