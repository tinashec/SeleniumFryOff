package zw.co.tinashechinyanga.test.Factory;

import org.openqa.selenium.WebDriver;
import zw.co.tinashechinyanga.test.Pages.EnterUserDetailsPage;
import zw.co.tinashechinyanga.test.Pages.FryBaconPage;
import zw.co.tinashechinyanga.test.Pages.SaveEntryOrFryAgainPage;
import zw.co.tinashechinyanga.test.Pages.SelectBaconPage;

/**
 * Created by Tinashe.Chinyanga on 8/23/2017.
 */
public class DriverFactory {
    public FryBaconPage fryBaconPage;
    public SelectBaconPage selectBaconPage;
    public SaveEntryOrFryAgainPage saveEntryOrFryAgainPage;
    public EnterUserDetailsPage enterUserDetailsPage;

    public DriverFactory(){
        fryBaconPage = new FryBaconPage();
        selectBaconPage = new SelectBaconPage();
        saveEntryOrFryAgainPage = new SaveEntryOrFryAgainPage();
        enterUserDetailsPage = new EnterUserDetailsPage();
    }
}
