package cz.pumpitup.pn5.starterkit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        WebNavigationTest.class,
        GetTimeFromWebTest.class,
        GetTimeFromRestTest.class,
        CompareTimeTest.class
})
public class ATestSuite {
}
