package zw.co.tinashechinyanga.test;

import org.junit.Test;
import zw.co.tinashechinyanga.test.Factory.DriverFactory;
import zw.co.tinashechinyanga.test.UserProfiles.UserProfile;
import zw.co.tinashechinyanga.test.Utils.CommonUtils;

/**
 * Created by Tinashe.Chinyanga on 8/21/2017.
 */
public class FryStreakyBacon {
    @Test
    public void streakyFryOff(){
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.selectBaconPage.navigateToFryOff();

        //select the streaky bacon
        driverFactory.selectBaconPage.selectBacon(CommonUtils.STREAKY_BACON);

        //fry for as long as you can
        driverFactory.fryBaconPage.fryBaconFor(5, CommonUtils.STREAKY_BACON);

        CommonUtils.waitForElemenVisibility();

        driverFactory.saveEntryOrFryAgainPage.clickServeEntryIcon();

        driverFactory.enterUserDetailsPage.enterNickname(UserProfile.NICKNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterFirstname(UserProfile.NAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterSurname(UserProfile.SURNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterEmail(UserProfile.EMAIL.getProfileValue());
        driverFactory.enterUserDetailsPage.enterCellphone(UserProfile.NUMBER.getProfileValue());

        driverFactory.enterUserDetailsPage.clickSubmitButton();

        System.out.println("Successfully submitted entry.");
    }
}
