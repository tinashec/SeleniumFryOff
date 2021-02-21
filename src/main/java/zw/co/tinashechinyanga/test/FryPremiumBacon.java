package zw.co.tinashechinyanga.test;

import org.junit.Test;
import zw.co.tinashechinyanga.test.Factory.DriverFactory;
import zw.co.tinashechinyanga.test.UserProfiles.UserProfile;
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
        driverFactory.fryBaconPage.fryBaconFor(5, CommonUtils.PREMIUM_BACON);

        CommonUtils.waitForElemenVisibility();

        driverFactory.saveEntryOrFryAgainPage.clickServeEntryIcon();

        driverFactory.enterUserDetailsPage.enterNickname(UserProfile.NICKNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterFirstname(UserProfile.NAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterSurname(UserProfile.SURNAME.getProfileValue());
        driverFactory.enterUserDetailsPage.enterCellphone(UserProfile.NUMBER.getProfileValue());
        driverFactory.enterUserDetailsPage.enterEmail(UserProfile.EMAIL.getProfileValue());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driverFactory.enterUserDetailsPage.clickSubmitButton();

        System.out.println("Successfully cooked bacon and submitted entry.");

    }
}
