package cz.pumpitup.pn5.starterkit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(SimpleNavigationTest.class)
public class TestSuite {
// yes: this test suite contains only one test class so that you can observe the pattern
}
