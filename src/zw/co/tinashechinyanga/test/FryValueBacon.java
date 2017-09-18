package zw.co.tinashechinyanga.test;

import org.junit.jupiter.api.Test;
import zw.co.tinashechinyanga.test.Factory.DriverFactory;
import zw.co.tinashechinyanga.test.UserProfiles.UserProfile;
import zw.co.tinashechinyanga.test.UserProfiles.YendeiProfile;
import zw.co.tinashechinyanga.test.Utils.CommonUtils;
import zw.co.tinashechinyanga.test.Utils.DriverUtils;

/**
 * Created by TinasheC on 8/15/2017.
 */
public class FryValueBacon {
    @Test
    public void clickPan(){
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.selectBaconPage.navigateToFryOff();

        //select the streaky bacon
        driverFactory.selectBaconPage.selectBacon(CommonUtils.VALUE_BACON);

        //fry for as long as you can
        driverFactory.fryBaconPage.fryBaconFor(10100, CommonUtils.VALUE_BACON);

        CommonUtils.waitForElemenVisibility();

        driverFactory.saveEntryOrFryAgainPage.clickServeEntryIcon();

        driverFactory.enterUserDetailsPage.enterNickname(UserProfile.NICKNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterSurname(UserProfile.SURNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterFirstname(UserProfile.NAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterCellphone(UserProfile.NUMBER.getProfileValue());
        driverFactory.enterUserDetailsPage.enterEmail(UserProfile.EMAIL.getProfileValue());

        driverFactory.enterUserDetailsPage.clickSubmitButton();
    }
}
