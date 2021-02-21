package zw.co.tinashechinyanga.test.Pages;

import org.openqa.selenium.WebElement;
import zw.co.tinashechinyanga.test.Utils.CommonUtils;

/**
 * Created by Tinashe.Chinyanga on 8/23/2017.
 */
public class SaveEntryOrFryAgainPage extends CommonUtils {
    public WebElement serveEntry;

    public void clickServeEntryIcon(){
        serveEntry = getElementByXpath("//img[@src='images/correct.png']");
        serveEntry.click();
    }
}
