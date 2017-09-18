package zw.co.tinashechinyanga.test;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zw.co.tinashechinyanga.test.Factory.DriverFactory;
import zw.co.tinashechinyanga.test.UserProfiles.TinasheProfile;
import zw.co.tinashechinyanga.test.Utils.CommonUtils;
import zw.co.tinashechinyanga.test.Utils.DriverUtils;

/**
 * Created by Tinashe.Chinyanga on 8/21/2017.
 */
public class FryMiddleCutBacon {
    @Test
    public void middleCutFryOff(){
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.selectBaconPage.navigateToFryOff();

        //select the streaky bacon
        driverFactory.selectBaconPage.selectBacon(CommonUtils.MIDDLE_CUT_BACON);

        //fry for as long as you can
        driverFactory.fryBaconPage.fryBaconFor(11200, CommonUtils.MIDDLE_CUT_BACON);

        //clear chrome cookies and populate with headless driver cookies for session data
//        DriverUtils.getDriver().manage().deleteAllCookies();
//
//        for(Cookie cookie : DriverUtils.getHeadlessDriver().manage().getCookies()){
//            DriverUtils.getDriver().manage().addCookie(cookie);
//        }
//
        new WebDriverWait(DriverUtils.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(CommonUtils.getElementByXpath("//img[@src='images/correct.png']")));

        //click serve entry page
        driverFactory.saveEntryOrFryAgainPage.clickServeEntryIcon();

        //enter user details
        driverFactory.enterUserDetailsPage.enterNickname(TinasheProfile.NICKNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterFirstname(TinasheProfile.NAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterSurname(TinasheProfile.SURNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterCellphone(TinasheProfile.NUMBER.getProfileValue());
        driverFactory.enterUserDetailsPage.enterEmail(TinasheProfile.EMAIL.getProfileValue());

        driverFactory.enterUserDetailsPage.clickSubmitButton();
        System.out.println("Successfully submitted entry after 6600 seconds");
    }
}
