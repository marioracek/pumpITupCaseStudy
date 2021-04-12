package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.web.WebApplication;
import cz.pumpitup.pn5.core.webdriver.Capability;
import cz.pumpitup.pn5.starterkit.pages.SearchPage;

@Capability(key = "browserName", value = "chrome")
public interface Google extends WebApplication {
    
    default SearchPage openSearchPage() {
        return open(SearchPage.class);
    }
    
}