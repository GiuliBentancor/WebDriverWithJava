package forgot;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;

public class forgotPasswordTest extends BaseTest {

    @Test
    public void testRetrievePassword(){
        var ForgotPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = ForgotPasswordPage.retrievePassword("tau@example.com");
        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
    }
}