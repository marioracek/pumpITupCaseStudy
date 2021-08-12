package cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup;

import cz.pumpitup.pn5.actions.ExtendedAction;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebDriverAccessor;
import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;

@Wait(value = PumpITupHomePage.RESULT_PAGE_SYMPTOM_XPATH, by = Lookup.XPATH, timeout = 20)
public interface PumpITupHomePage extends WebDriverAccessor {

    String RESULT_PAGE_SYMPTOM_XPATH = "//div[@id=\"intro\"]";

    @ExtendedAction
    default PumpITupHomePage printTitle() {
        System.out.println(getDriver().getTitle());
        return this;
    }

    @ExtendedAction
    default PumpITupHomePage assertThatContainsText(String text) {
        try {
            String expression = String.format("//*[contains(text(), \"%s\")]", text);
            getDriver().findElement(By.xpath(expression));
        } catch (Exception e) {
            throw new AssertionFailedError("The text \"" + text + "\" was not found on page");
        }
        return this;
    }

}