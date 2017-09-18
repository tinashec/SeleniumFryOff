package zw.co.tinashechinyanga.test;

import org.junit.Test;
import zw.co.tinashechinyanga.test.Factory.DriverFactory;
import zw.co.tinashechinyanga.test.UserProfiles.MunozProfile;
import zw.co.tinashechinyanga.test.UserProfiles.MutsaProfile;
import zw.co.tinashechinyanga.test.Utils.CommonUtils;

/**
 * Created by Tinashe.Chinyanga on 8/20/2017.
 */
public class FryPremiumBacon {
    @Test
    public void fryPremium(){
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.selectBaconPage.navigateToFryOff();

        //select the streaky bacon
        driverFactory.selectBaconPage.selectBacon(CommonUtils.PREMIUM_BACON);

        //fry for as long as you can
        driverFactory.fryBaconPage.fryBaconFor(11600, CommonUtils.PREMIUM_BACON);

        CommonUtils.waitForElemenVisibility();

        driverFactory.saveEntryOrFryAgainPage.clickServeEntryIcon();

        driverFactory.enterUserDetailsPage.enterNickname(MunozProfile.NICKNAME.getValue());
        driverFactory.enterUserDetailsPage.enterFirstname(MunozProfile.NAME.getValue());
        driverFactory.enterUserDetailsPage.enterSurname(MunozProfile.SURNAME.getValue());
        driverFactory.enterUserDetailsPage.enterCellphone(MunozProfile.NUMBER.getValue());
        driverFactory.enterUserDetailsPage.enterEmail(MunozProfile.EMAIL.getValue());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driverFactory.enterUserDetailsPage.clickSubmitButton();

        System.out.println("Successfully cooked bacon and submitted entry.");

    }
}
