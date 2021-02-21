package zw.co.tinashechinyanga.test.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zw.co.tinashechinyanga.test.Pages.FryBaconPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tinashe.Chinyanga on 8/20/2017.
 */
public abstract class CommonUtils {
    public static WebDriver driver, edgeDriver;

    public static final String VALUE_BACON = "value-bacon";
    public static final String STREAKY_BACON = "streaky-bacon";
    public static final String MIDDLE_CUT_BACON = "middle-cut-bacon";
    public static final String PREMIUM_BACON = "premium-bacon";

    public CommonUtils(){

        driver = DriverUtils.getDriver();
    }

    public static WebElement getElement(String id){
        return driver.findElement(By.id(id));
    }

    public static WebElement getElementByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public static WebElement getElementByCss(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public static void navigateTo(String URL){
        driver.get(URL);
    }

    public void fryBaconFor(int durationInSecs, String baconType){
        for(long stopEx = System.nanoTime() + TimeUnit.SECONDS.toNanos(durationInSecs); stopEx > System.nanoTime();){

            /*
            * get all pans
            * check if value is 4
            * remove pan
            * */

            for(int webElementId = 1; webElementId <= 9; webElementId++){
                if(FryBaconPage.getPanElement(webElementId).getAttribute("value").equals("4")){
                    FryBaconPage.removeReadyPanElement(FryBaconPage.getPanElement(webElementId), driver, baconType);
                }
            }
        }
    }

    public static void waitForElemenVisibility(){
        new WebDriverWait(DriverUtils.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(CommonUtils.getElementByXpath("//img[@src='images/correct.png']")));
    }
}
