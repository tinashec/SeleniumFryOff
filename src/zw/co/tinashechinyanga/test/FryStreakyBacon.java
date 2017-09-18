package zw.co.tinashechinyanga.test;

import org.junit.Test;
import zw.co.tinashechinyanga.test.Factory.DriverFactory;
import zw.co.tinashechinyanga.test.UserProfiles.YendeiProfile;
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
        driverFactory.fryBaconPage.fryBaconFor(7200, CommonUtils.STREAKY_BACON);

        CommonUtils.waitForElemenVisibility();

        driverFactory.saveEntryOrFryAgainPage.clickServeEntryIcon();

        driverFactory.enterUserDetailsPage.enterNickname(YendeiProfile.NICKNAME.getValue());
        driverFactory.enterUserDetailsPage.enterFirstname(YendeiProfile.NAME.getValue());
        driverFactory.enterUserDetailsPage.enterSurname(YendeiProfile.SURNAME.getValue());
        driverFactory.enterUserDetailsPage.enterEmail(YendeiProfile.EMAIL.getValue());
        driverFactory.enterUserDetailsPage.enterCellphone(YendeiProfile.NUMBER.getValue());

        driverFactory.enterUserDetailsPage.clickSubmitButton();

        System.out.println("Successfully submitted entry.");
    }
}
