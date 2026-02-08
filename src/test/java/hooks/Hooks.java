package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import base.BaseClass;

/**
 * Hooks:
 * - Cucumber-specific feature
 * - Runs before and after each scenario
 *
 * ✅ Interview Note:
 * Hooks ensure clean driver lifecycle management.
 */
public class Hooks {
    @Before
    public void setUp() {
        BaseClass.getDriver();
    }

    @After
    public void tearDown() {
        BaseClass.quitDriver();
    }
}
