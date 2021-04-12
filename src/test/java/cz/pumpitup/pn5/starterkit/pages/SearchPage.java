package cz.pumpitup.pn5.starterkit.pages;

import cz.pumpitup.pn5.actions.ExtendedAction;
import cz.pumpitup.pn5.actions.SetValue;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebDriverAccessor;
import cz.pumpitup.pn5.web.actions.Navigate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Navigate("https://www.google.com/ncr")
public interface SearchPage extends WebDriverAccessor {

    String BUTTON_ID = "introAgreeButton";

    @ExtendedAction
    default SearchPage AcceptCookies(){       
        WebElement iFrame= getDriver().findElement(By.tagName("iframe"));
        getDriver().switchTo().frame(iFrame);
        getDriver().findElement(By.id(BUTTON_ID)).click();
        return null;
    };

    @SetValue(value = "q", by = Lookup.NAME)
    SearchPage typeIntoSearchBox(String term);

    @ExtendedAction
    default SearchPage submit() {
        getDriver().findElement(By.name("q")).submit();        
        return null;
    }    

    SearchResultsPage onSearchResultsPage();

}
