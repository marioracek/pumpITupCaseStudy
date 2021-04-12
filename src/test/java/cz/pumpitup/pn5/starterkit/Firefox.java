package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.webdriver.Capability;
import cz.pumpitup.pn5.web.WebApplication;
import cz.pumpitup.pn5.starterkit.pages.SearchPage;


@Capability(key = "browserName", value = "firefox")
//@Capability(key = "browser.privatebrowsing.autostart", value = "True")
//@Capability(key = "options", value = "incognito")
//@Capability(key = "ChromeOptions", value = "--incognito")
public interface Firefox extends WebApplication {  
    
    default SearchPage openSearchPage() {
        return open(SearchPage.class);
    }
    
    
}