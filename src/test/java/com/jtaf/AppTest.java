package com.jtaf;

import org.finra.jtaf.ewd.ExtWebDriver;
import org.finra.jtaf.ewd.session.SessionManager;
import org.finra.jtaf.ewd.widget.IButton;
import org.finra.jtaf.ewd.widget.element.html.Button;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by k26511 on 7/13/2017.
 */
public class AppTest {

    @Test
    public void testLearnMoreButton() throws Exception {
        // Get a new ExtWebDriver session
        ExtWebDriver ewd = SessionManager.getInstance().getNewSession("client", "client.properties");

        // Open ExtWebDriver home page
        ewd.open("http://finraos.github.io/JTAF-ExtWebDriver");

        // Create Button object
        IButton b = new Button("//*[contains(@class,'btn') and text()='Learn more »']");

        // Wait for existence of the button
        b.waitForElementPresent();

        // Click on button
        b.click();

        // Verify the page title
        Assert.assertEquals("Extensions for WebDriver - Getting Started", ewd.getTitle());
    }
}
