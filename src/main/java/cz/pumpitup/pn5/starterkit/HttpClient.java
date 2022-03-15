package cz.pumpitup.pn5.starterkit;

import cz.pumpitup.pn5.core.webdriver.Capability;
import cz.pumpitup.pn5.remote.http.HttpApplication;


@Capability(key = "browserName", value = "pn5-driver8")
public interface HttpClient extends HttpApplication {
}