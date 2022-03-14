package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.webdriver.Capability;
import cz.pumpitup.pn5.core.webdriver.ValueType;
import cz.pumpitup.pn5.remote.http.HttpApplication;
import cz.pumpitup.pn5.starterkit.Internet.pages.google.GoogleSearchPage;
import cz.pumpitup.pn5.starterkit.Internet.pages.timeis.TimeIsPage;
import cz.pumpitup.pn5.web.WebApplication;


@Capability(key = "browserName", value = "pn5-driver8")
public interface HttpClient extends HttpApplication {

}